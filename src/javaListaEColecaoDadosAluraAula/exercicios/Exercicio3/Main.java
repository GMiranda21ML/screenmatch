package javaListaEColecaoDadosAluraAula.exercicios.Exercicio3;

import javaListaEColecaoDadosAluraAula.exercicios.Exercicio3.HoraDaPratica3.modelos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        1. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        2. Crie uma classe Animal e uma classe Cachorro que herda de Animal.
        Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
        3. Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
        4. Crie uma classe Produto com propriedades como nome e preço.
        Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
        5. Crie uma interface Forma com um método calcularArea().
        Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma)
        e utilize um loop para calcular e imprimir a área de cada forma.
        6. Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
        Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    HORA DA PRATICA 3
                    
                    Digite 1 para o exemplo 1
                    Digite 2 para o exemplo 2
                    Digite 3 para o exemplo 3
                    Digite 4 para o exemplo 4
                    Digite 5 para o exemplo 5
                    Digite 6 para o exemplo 6
                    Digite 0 para sair""");
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nExemplo 1: ");
                    scanner.nextLine();
                    ArrayList<String> listaString = new ArrayList<>();
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Digite um nome: ");
                        listaString.add(scanner.nextLine());
                    }

                    listaString.forEach(System.out::println);
                    // for (String item : listaString) {
                    //      System.out.println(item);
                    // }
                    break;

                case 2:
                    // Cachorro cachorro = new Cachorro("Simba", 1);
                    // Animal animal = (Animal) cachorro;
                    Animal animal = new Cachorro("Simba", 1);
                    if (animal instanceof Cachorro) {
                        Cachorro cachorro = (Cachorro) animal;
                        System.out.println("O objeto é um CHachorro");
                    } else {
                        System.out.println("O objeto não é um Cachorro.");
                    }
                    break;


                case 4:
                    System.out.println("\nExemplo 4: ");
                    Produto produto1 = new Produto("carne", 30);
                    Produto produto2 = new Produto("arroz", 15);
                    Produto produto3 = new Produto("feijao", 45);

                    ArrayList<Produto> listaProdutos = new ArrayList<>();
                    listaProdutos.add(produto1);
                    listaProdutos.add(produto2);
                    listaProdutos.add(produto3);

                    double precoTotal = 0;
                    for (Produto item : listaProdutos) {
                        precoTotal += item.getPreco();
                    }

                    double mediaPreco = precoTotal / listaProdutos.size();
                    System.out.printf("Media dos preços: R$%.2f\n", mediaPreco);
                    break;

                case 5:
                    System.out.println("\nExemplo 5: ");
                    Circulo circulo = new Circulo(2);
                    Quadrado quadrado = new Quadrado(4);

                    ArrayList<Forma> listaDasAreas = new ArrayList<>();
                    listaDasAreas.add(circulo);
                    listaDasAreas.add(quadrado);

                    for (Forma item : listaDasAreas) {
                        System.out.printf("Área: %.1f\n", item.getCalcularArea());
                    }
                    break;

                case 6:
                    System.out.println("\nExemplo 6: ");
                    ContaBancaria contaBancaria1 = new ContaBancaria(1234, 250.55);
                    ContaBancaria contaBancaria2 = new ContaBancaria(4321, 500.00);
                    ContaBancaria contaBancaria3 = new ContaBancaria(5678, 100.00);
                    ContaBancaria contaBancaria4 = new ContaBancaria(8765, 1000.00);
                    ContaBancaria contaBancaria5 = new ContaBancaria(9012, 750.00);
                    ContaBancaria contaBancaria6 = new ContaBancaria(2109, 300.00);

                    ArrayList<ContaBancaria> listaContaBancaria = new ArrayList<>();
                    listaContaBancaria.add(contaBancaria1);
                    listaContaBancaria.add(contaBancaria2);
                    listaContaBancaria.add(contaBancaria3);
                    listaContaBancaria.add(contaBancaria4);
                    listaContaBancaria.add(contaBancaria5);
                    listaContaBancaria.add(contaBancaria6);

                    double maiorSaldo = 0;
                    for (ContaBancaria item : listaContaBancaria) {
                        if (maiorSaldo < item.getSaldo()) {
                            maiorSaldo = item.getSaldo();
                        }
                    }

                    System.out.println("Maior saldo de todas as contas é: " + maiorSaldo);

                    break;

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
