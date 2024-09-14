package javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.modelos;

import javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    // 3. Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número.
    //    A classe deve receber o número como parâmetro.

    @Override
    public void getMostrarTabuada(int numero) {
        System.out.println("TABUADA DO " + numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d * %d = %d\n", numero, i, resultado);
        }
    }

}
