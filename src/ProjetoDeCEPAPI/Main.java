package ProjetoDeCEPAPI;

import ProjetoDeCEPAPI.modelos.ArquivoJson;
import ProjetoDeCEPAPI.modelos.BuscarCep;
import ProjetoDeCEPAPI.modelos.EnderecoComCep;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Bem vindo ao buscador de CEP!!");
        System.out.print("Digite seu CEP para buscar: ");
        String cep = scanner.nextLine();

        try {
            BuscarCep buscarCep = new BuscarCep();

            EnderecoComCep endereco = buscarCep.buscarEndereco(cep);
            System.out.println(endereco);
            ArquivoJson arquivoJson = new ArquivoJson();
            System.out.println("\n Arquivo .JSON criado");
            arquivoJson.criarArquivo(endereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }








    }
}
