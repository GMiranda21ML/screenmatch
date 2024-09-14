package javaListaEColecaoDadosAluraAula.exercicios.Exercicio3.HoraDaPratica3.modelos;

public class Produto {
    // 4. Crie uma classe Produto com propriedades como nome e preço.
    //    Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}
