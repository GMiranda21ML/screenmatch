package javaPOOAluraAula.exercicios.Exercicio4;
import javaPOOAluraAula.exercicios.Exercicio4.horaDaPratica2.modelos.*;

import java.util.Scanner;

public class HoraDaPratica2 {
    public static void main(String[] args) {

        /*
        1. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
        Implemente métodos getters e setters para os atributos privados.
        2. Crie uma classe idadePessoa com os atributos privados nome e idade.
        Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
        3. Desenvolva uma classe Produto com os atributos privados nome e preco.
        Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
        4. Desenvolva uma classe Aluno com os atributos privados nome e notas.
        Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um método calcularMedia que retorna a média das notas do aluno.
        5. Desenvolva uma classe Livro com os atributos privados titulo e autor.
        Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um método exibirDetalhes que imprime o título e o autor do livro.
         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    
                    HORA DA PRATICA 2:
                                    
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
                    ContaBancaria exemplo1 = new ContaBancaria();
                    exemplo1.titular = "Gabriel Miranda Mucarbel de Lima";
                    System.out.printf("Bem vindo %s!!\n", exemplo1.titular);
                    System.out.print("Por favor, digite o número da sua conta bancaria para ter acesso as suas informações: ");
                    exemplo1.setNumeroConta(scanner.nextInt());
                    exemplo1.setSaldo(5000);
                    exemplo1.informacoesEx1();
                    break;

                case 2:
                    System.out.println("\nExemplo 2: ");
                    IdadePessoa exemplo2 = new IdadePessoa();
                    exemplo2.setNome("Giovana Carrilho");
                    exemplo2.setIdade(17);
                    System.out.printf("setNome: %s, setIdade: %d\n", exemplo2.getNome(), exemplo2.getIdade());
                    exemplo2.informacoesEx2();
                    exemplo2.verificarIdade();
                    break;

                case 3:
                    System.out.println("\nExemplo 3");
                    Produto exemplo3 = new Produto();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    exemplo3.setNome(scanner.nextLine());
                    System.out.print("Digite o preço do produto: ");
                    exemplo3.setPreco(scanner.nextDouble());
                    System.out.print("Digite o valor do desconto: ");
                    int desconto = scanner.nextInt();
                    exemplo3.informacoesEx3();
                    System.out.printf("- Preço do produto com desconto: R$%.2f\n", exemplo3.aplicarDesconto(desconto));
                    break;

                case 4:
                    System.out.println("\nExemplo 4: ");
                    Aluno exemplo4 = new Aluno();
                    exemplo4.setNome("Gabriel Miranda");
                    exemplo4.somaDasNotas(7.5);
                    exemplo4.somaDasNotas(6.5);
                    exemplo4.somaDasNotas(8);
                    System.out.printf("A media das notas do aluno %s é %.2f\n", exemplo4.getNome(), exemplo4.calcularMedia());
                    break;

                case 5:
                    System.out.println("\nExemplo 5: ");
                    Livro exemplo5Livro1 = new Livro("Harry Potter", "J.K Rowling");
                    Livro exemplo5Livro2 = new Livro("Os 7 maridos de Evelyn Hugo", "Taylor Jenkins Reid");
                    exemplo5Livro1.informacoes();
                    exemplo5Livro2.informacoes();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção invalida tente novamente!");
                    break;
            }


        }


    }
}
