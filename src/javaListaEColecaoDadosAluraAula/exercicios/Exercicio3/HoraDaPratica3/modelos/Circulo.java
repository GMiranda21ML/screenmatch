package javaListaEColecaoDadosAluraAula.exercicios.Exercicio3.HoraDaPratica3.modelos;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double getCalcularArea() {
        return 3.14 * this.raio * this.raio;
    }
}
