package JavaAPIAlura.exercicios.Exercicio1;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*
        1. Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse
        para fazer uma consulta à API do Google Books. Solicite ao
        usuário que insira o título de um livro, e exiba as informações disponíveis
        sobre o livro retornado pela API.
        2. Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse
        para fazer uma consulta à API CoinGecko e exiba a cotação atual de uma
        criptomoeda escolhida pelo usuário.
        3. Crie um programa Java que faça uma consulta à API do TheMealDB utilizando
        as classes HttpClient, HttpRequest e HttpResponse.
        Solicite ao usuário que insira o nome de uma receita
        e exiba as informações disponíveis sobre essa receita.
         */

        Scanner scanner = new Scanner(System.in);

//        System.out.println("\nExemplo 1: ");
//        System.out.print("Digite o nome do livro: ");
//        var buscaExemplo1 = scanner.nextLine();
//
//        String enderecoExemplo1 = "https://www.googleapis.com/books/v1/volumes?q=" + buscaExemplo1;
//
//        HttpClient clientExemplo1 = HttpClient.newHttpClient();
//        HttpRequest requestExemplo1 = HttpRequest.newBuilder()
//                .uri(URI.create(enderecoExemplo1))
//                .build();
//        HttpResponse<String> responseExemplo1 = clientExemplo1
//                .send(requestExemplo1, HttpResponse.BodyHandlers.ofString());
//        System.out.println(responseExemplo1.body());

// ------------------------------------------------------------------------

//        System.out.print("Digite a criptomoeda: ");
//        var buscarExemplo2 = scanner.nextLine();
//
//        String enderecoExemplo2 = "https://api.coingecko.com/api/v3/search?query=" + buscarExemplo2;
//
//        HttpClient clientExemplo2 = HttpClient.newHttpClient();
//        HttpRequest requestExemplo2 = HttpRequest.newBuilder()
//                .uri(URI.create(enderecoExemplo2))
//                .build();
//        HttpResponse<String> responseExemplo2 = clientExemplo2
//                .send(requestExemplo2, HttpResponse.BodyHandlers.ofString());
//        System.out.println(responseExemplo2.body());

// ------------------------------------------------------------------------

        System.out.println("Exemplo 3: ");
        System.out.print("Digite o nome da receita: ");
        var buscar = scanner.nextLine();

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + buscar;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());










    }
}
