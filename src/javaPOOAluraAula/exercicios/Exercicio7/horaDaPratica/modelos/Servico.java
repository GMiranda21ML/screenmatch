package javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.modelos;

import javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.interfaces.Vendavel;

public class Servico implements Vendavel {
    // 6. Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos.
    //    Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

    private double precoHora;

    // Construtor e outros métodos

    @Override
    public double getPrecoPorQuantidade(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void getAplicarDesconto(double desconto) {
        precoHora -= precoHora * (desconto / 100.0);
    }

}
