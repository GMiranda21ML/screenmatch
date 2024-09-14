package javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.modelos;

import javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.interfaces.ConversaoFinanceira;

public class ConversorMoedas implements ConversaoFinanceira {
    // 1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal()
    //    para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

    @Override
    public void getConverterDolarParaReal(double dolar) {
        double cotacaoDolar = 5.50;
        double real = cotacaoDolar * dolar;
        System.out.printf("%.2f$ em real é R$%.2f\n", dolar, real);
    }

}
