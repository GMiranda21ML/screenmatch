package javaPOOAluraAula.exercicios.Exercicio2;

public class Carro {
    // Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro

    String modelo;
    int ano;
    String cor;

    void fichaTecnicaExemplo4() {
        System.out.printf("""
                FICHA TECNICA
                - Modelo do carro: %s
                - Ano do carro: %d
                - Cor do carro: %s
                """, modelo, ano, cor);
    }

    double idadeDoCarro() {
        return 2024 - ano;
    }

}
