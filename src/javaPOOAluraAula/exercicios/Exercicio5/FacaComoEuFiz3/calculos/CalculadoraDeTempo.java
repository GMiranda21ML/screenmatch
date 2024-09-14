package javaPOOAluraAula.exercicios.Exercicio5.FacaComoEuFiz3.calculos;

import javaPOOAluraAula.exercicios.Exercicio5.FacaComoEuFiz3.modelos.Titulo;

public class CalculadoraDeTempo {
    // atributos
    private int tempoTotal;

    // getters
    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // tempo total para maratonar
    public void tempo(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    // tempo em hora
    public double tempoEmHora() {
        return (double) this.tempoTotal / 60;
    }

}
