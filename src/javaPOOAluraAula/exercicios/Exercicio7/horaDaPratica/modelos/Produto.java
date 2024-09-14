package javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.modelos;

import javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.interfaces.Vendavel;

public class Produto implements Vendavel {
    // 6. Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos.
    //    Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

    private double precoUnitario;

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    @Override
    public double getPrecoPorQuantidade(int quantidade) {
        return precoUnitario * quantidade;
    }

    public void mensagem() {

    }

    @Override
    public void getAplicarDesconto(double desconto){
        this.precoUnitario -= desconto / 100;
        System.out.printf("""
                - Desconto fornecido: %.0f%%
                - Preço com desconto: R$%.2f\n""", desconto, precoUnitario);
    }

}
