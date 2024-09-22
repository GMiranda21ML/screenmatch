package JavaAPIAlura.exercicios.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        // try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

        try {
            int divisao = num1/num2;
            System.out.printf("Divisão de %d / %d = %d", num1, num2, divisao);
        } catch (ArithmeticException e) {
            System.out.println("Impossivel fazer divisão por 0");
            System.out.println(e.getMessage());
        }



    }
}
