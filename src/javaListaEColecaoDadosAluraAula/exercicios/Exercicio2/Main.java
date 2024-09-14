package javaListaEColecaoDadosAluraAula.exercicios.Exercicio2;

import javaListaEColecaoDadosAluraAula.exercicios.Exercicio2.HoraDaPratica2.modelos.Produto;
import javaListaEColecaoDadosAluraAula.exercicios.Exercicio2.HoraDaPratica2.modelos.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        1. Crie uma classe Produto com atributos como nome, preco, e quantidade.
        Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
        Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
        2. Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
        Em seguida, imprima a lista de produtos utilizando o método System.out.println().
        3. Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
        Em seguida, crie objetos Produto utilizando esse novo construtor.
        4. Crie uma classe ProdutoPerecivel que herde de Produto.
        Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
        Crie um objeto ProdutoPerecivel e imprima seus valores.
         */

        var produto1 = new Produto("Camisa", 100.0, 3);
        var produto2 = new Produto("Água mineral", 2.50, 10);
        var produto3 = new Produto("Caneca", 19.99, 5);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        System.out.println("Quantidade de produtos na lista: " + listaDeProdutos.size());
        System.out.println("Produto 1: " + listaDeProdutos.get(1).getNome());
        System.out.println(listaDeProdutos);

        var produtoPerecivel = new ProdutoPerecivel("Leite", 9.99, 2, 10);
        listaDeProdutos.add(produtoPerecivel);
        System.out.println(listaDeProdutos.getLast());


    }
}
