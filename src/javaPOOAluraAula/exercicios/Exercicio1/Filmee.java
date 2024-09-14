package javaPOOAluraAula.exercicios.Exercicio1;

public class Filmee {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.printf("Nome do filme: %s\n", nome);
        System.out.printf("Ano de lançamento: %d\n", anoDeLancamento);
        System.out.printf("Duração em minutos: %d minutos\n", duracaoEmMinutos);
        System.out.printf("Incluido no plano: %b\n", incluidoNoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
