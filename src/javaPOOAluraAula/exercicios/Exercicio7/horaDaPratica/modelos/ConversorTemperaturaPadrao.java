package javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.modelos;

import javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    // 4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
    //    Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

    @Override
    public void celciusFahrenheit(double celcius) {
        double temperaturaEmFahrenheit = ((celcius * 9 / 5) + 32);
        System.out.printf("Temperatura em Celcius %.1fC para Fahrenheit %.1fF\n", celcius, temperaturaEmFahrenheit);
    }

    @Override
    public void fahrenheitCelcius(double fahrenheit) {
        double temperaturaEmCelcius = (5 * (fahrenheit - 32) / 9);
        System.out.printf("Temperatura em Fahrenheit %.1fF para Celcius %.1f\n", fahrenheit, temperaturaEmCelcius);
    }


}
