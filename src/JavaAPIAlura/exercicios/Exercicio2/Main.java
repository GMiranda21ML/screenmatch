package JavaAPIAlura.exercicios.Exercicio2;

import JavaAPIAlura.exercicios.Exercicio2.modelos.Livro;
import JavaAPIAlura.exercicios.Exercicio2.modelos.Pessoa;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        /*
        1. Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
        Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa.
        2. Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem ausentes
        ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação da biblioteca Gson para flexibilizar a conversão.
        3. Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora.
        Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro em um objeto do tipo Livro.
         */

//        String jsonPessoa = """
//                {
//                    "Nome" : "Gabriel",
//                    "Idade" : 18,
//                    "Cidade" : "Olinda"
//                }
//                """;
//
//        Gson gson = new GsonBuilder().setLenient().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
//        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
//        System.out.println(pessoa);



        String jsonLivro = """
                {
                    "Titulo":"Harry Potter",
                    "Autor":"J.K.Rowlling",
                    "Editora":{
                        "Nome":"Bloomsbury Publishing",
                        "Cidade":"Londres"
                    }
                }
                """;

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);


    }
}
