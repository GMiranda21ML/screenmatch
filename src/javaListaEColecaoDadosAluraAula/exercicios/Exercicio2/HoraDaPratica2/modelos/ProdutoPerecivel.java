package javaListaEColecaoDadosAluraAula.exercicios.Exercicio2.HoraDaPratica2.modelos;

public class ProdutoPerecivel extends Produto {
    // 4. Crie uma classe ProdutoPerecivel que herde de Produto.
    //    Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
    //    Crie um objeto ProdutoPerecivel e imprima seus valores.

    // atributos
    private int dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    // getters
    public int getDataDeValidade() {
        return this.dataDeValidade;
    }



}
