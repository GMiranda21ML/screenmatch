package JavaAPIAlura.exercicios.Exercicio4;

import JavaAPIAlura.exercicios.Exercicio4.modelos.Tituloo;
import JavaAPIAlura.exercicios.Exercicio4.modelos.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        /*
        1. Crie um programa em Java que escreva a seguinte mensagem em um arquivo
        chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo."
        Utilize as classes do pacote java.io.
        2. Defina uma classe chamada Titulo com os atributos necessários.
        Em seguida, crie um programa que instancia um objeto Titulo,
        serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
        3. Modifique o programa anterior para que o JSON gerado seja formatado de
        maneira mais elegante. Utilize o método setPrettyPrinting para alcançar esse resultado.
        4. Defina uma classe chamada Veiculo com os atributos necessários.
        Em seguida, crie um programa que instancia um objeto Veiculo,
        serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
        */

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Exemplo 1:");
//        File file = new File("C:\\Gabriel Miranda\\linguagens e afins\\intelij\\testes\\arquivo.txt");
//        FileWriter writer = new FileWriter(file);
//        System.out.print("Digite oq vc deseja escrever no arquivo: ");
//        String texto = scanner.nextLine();
//        writer.write(texto);
//        writer.close();
//
//        FileReader reader = new FileReader(file);
//        System.out.println("Arquivo.txt: ");
//        int data = reader.read();
//        while (data != -1) {
//            System.out.print((char) data);
//            data = reader.read();
//        }
//        reader.close();

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        System.out.println("Exemplo 2 e 3: ");
//        Tituloo tituloo = new Tituloo();
//        Gson gson = new GsonBuilder()
//                .setPrettyPrinting()
//                .create();
//
//        String json = gson.toJson(tituloo);
//        System.out.println(json);

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        System.out.println("Exemplo 4: ");
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Honda");
        veiculo.setModelo("Civic");
        veiculo.setAno(2018);
        veiculo.setKmRodados(25000);
        veiculo.setPreco(105000);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(veiculo);
        System.out.println(json);




    }
}
