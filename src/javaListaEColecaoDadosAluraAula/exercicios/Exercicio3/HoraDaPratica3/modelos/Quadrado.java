package javaListaEColecaoDadosAluraAula.exercicios.Exercicio3.HoraDaPratica3.modelos;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getCalcularArea() {
        return lado * lado;
    }

}
