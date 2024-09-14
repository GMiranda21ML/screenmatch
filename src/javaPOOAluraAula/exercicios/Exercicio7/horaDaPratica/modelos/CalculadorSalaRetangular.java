package javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.modelos;

import javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.interfaces.CalculoGeometrico;

public class CalculadorSalaRetangular implements CalculoGeometrico {
    // 2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea()
    //    e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

    @Override
    public void getCalcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.printf("Area de um retangulo: %.1fcm²\n", area);
    }

    @Override
    public void getCalcularPerimetro(double altura, double largura) {
        double perimetro = (altura * 2) + (largura * 2);
        System.out.printf("Perimetro de um retangulo: %.1f\n", perimetro);
    }

}
