package atestes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testeFileIo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Gabriel Miranda\\linguagens e afins\\intelij\\testes\\teste.txt");
        FileWriter writer = new FileWriter(file);
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite algo para aparecer no arquivo txt: ");
        String texto = scanner.nextLine();
        writer.write(texto);
        writer.close();

        System.out.println("Arquivo txt");
        int data = reader.read();
        while (data != -1){
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();


//        try {
//            File arquivo = new File("filmes.txt");
//            Scanner scanner = new Scanner(arquivo);
//
//            while (scanner.hasNextLine()) {
//                String linha = scanner.nextLine();
//                System.out.println(linha);
//            }
//
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Arquivo não encontrado!");
//        }
//        ve mais depois



    }
}
