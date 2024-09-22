package JavaAPIAlura.exercicios.Exercicio3;

import JavaAPIAlura.exercicios.Exercicio3.execoes.ErroConsultaGitHubException;
import JavaAPIAlura.exercicios.Exercicio3.execoes.SenhaInvalidaException;
import JavaAPIAlura.exercicios.Exercicio3.modelos.Exemplo3;
import com.google.gson.Gson;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        1. Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
        Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
        2. Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
        uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos
        (por exemplo, ter pelo menos 8 caracteres).
        3. Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub
        (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException,
        que estende RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado.
        No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.
         */

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Exemplo 1");
//        // try {
//            System.out.print("Digite o primeiro número: ");
//            int num1 = scanner.nextInt();
//            System.out.print("Digite o segundo número: ");
//            int num2 = scanner.nextInt();
//
//        try {
//            int divisao = num1/num2;
//            System.out.printf("Divisão de %d / %d = %d", num1, num2, divisao);
//        } catch (ArithmeticException e) {
//            System.out.println("Impossivel fazer divisão por 0");
//            System.out.println(e.getMessage());
//        }


//        System.out.print("Exemplo 2: ");
//        System.out.print("Digite sua nova senha com no  minimo 8 caracteres: ");
//        var senha = scanner.nextLine();
//
//        try {
//            if (senha.length() < 8) {
//                throw new SenhaInvalidaException("Senha invalida, por favor insira uma senha com no minimo 8 digitos!");
//            } else {
//                System.out.println("Senha valida");
//            }
//        } catch (SenhaInvalidaException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }


        System.out.println("Exemplo 3");

        var buscar = scanner.nextLine();
        String endereco = "https://api.github.com/users/" + buscar;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("User do github invalido!");
            }

            String json = response.body();
            Gson gson = new Gson();
            Exemplo3 organizado = gson.fromJson(json, Exemplo3.class);
            System.out.println(organizado);

        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro: " + e.getMessage());
        }



    }
}
