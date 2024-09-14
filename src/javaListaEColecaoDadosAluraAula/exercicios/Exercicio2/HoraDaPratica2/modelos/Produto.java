package javaListaEColecaoDadosAluraAula.exercicios.Exercicio2.HoraDaPratica2.modelos;

public class Produto {
    // 1. Crie uma classe Produto com atributos como nome, preco, e quantidade.
    //    Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
    //    Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

    // 2. Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
    //    Em seguida, imprima a lista de produtos utilizando o método System.out.println().

    // atributos
    private String nome;
    private double preco;
    private int quantidade;

    // construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    // Override do toString
    @Override
    public String toString() {
        return String.format("Tem %d quantidades do produto %s que custa R$%.2f cada!!", this.getQuantidade(), this.getNome(), this.getPreco());
//        return String.format("""
//
//                - Nome do produto: %s
//                - Preço = R$%.2f
//                - quantidade = %d
//                """, this.getNome(), this.getPreco(), this.getQuantidade());
    }


}
