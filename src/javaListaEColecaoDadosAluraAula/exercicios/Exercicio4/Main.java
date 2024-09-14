package javaListaEColecaoDadosAluraAula.exercicios.Exercicio4;

import javaListaEColecaoDadosAluraAula.exercicios.Exercicio4.HoradaPratica4.modelos.Titulo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
        Em seguida, imprima a lista ordenada.
        2. Crie uma classe Titulo com um atributo nome do tipo String.
        Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.
        3. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
        Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
        4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
        Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
        5. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.
         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    HORA DA PRATICA 4
                    
                    Digite 1 para o exemplo 1
                    Digite 2 para o exemplo 2
                    Digite 3 para o exemplo 3
                    Digite 4 para o exemplo 4
                    Digite 5 para o exemplo 5
                    Digite 0 para sair""");
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nExemplo 1: ");
                    List<Integer> listaNumerosInteiros = new LinkedList<>();
                    listaNumerosInteiros.add(4);
                    listaNumerosInteiros.add(21);
                    listaNumerosInteiros.add(13);
                    listaNumerosInteiros.add(94);
                    listaNumerosInteiros.add(1);
                    listaNumerosInteiros.add(33);
                    Collections.sort(listaNumerosInteiros);
                    System.out.println(listaNumerosInteiros);
                    break;

                case 2:
                    List<Titulo> listaExemplo2E3 = new LinkedList<>();
                    listaExemplo2E3.add(new Titulo("B"));
                    listaExemplo2E3.add(new Titulo("A"));
                    listaExemplo2E3.add(new Titulo("C"));
                    Collections.sort(listaExemplo2E3);
                    for (Titulo item : listaExemplo2E3) {
                        System.out.println(item.getNome());
                    }


                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção invalida, tente novamente!");
                    break;
            }

        }


    }
}
