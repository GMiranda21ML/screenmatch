package javaPOOAluraAula.exercicios.Exercicio5;

import javaPOOAluraAula.exercicios.Exercicio5.FacaComoEuFiz3.calculos.CalculadoraDeTempo;
import javaPOOAluraAula.exercicios.Exercicio5.FacaComoEuFiz3.modelos.Filme;
import javaPOOAluraAula.exercicios.Exercicio5.FacaComoEuFiz3.modelos.Serie;

public class PrincipalEx5 {
    public static void main(String[] args) {

        // filme 1
        Filme filme1 = new Filme();
        filme1.setNome("Deadpool & Wolverine");
        filme1.setDiretor("Shawn Levy");
        filme1.setAnoDeLancamento(2024);
        filme1.setDuracaoEmMinutos(127);
        filme1.setIncluidoNoPlano(true);
        filme1.somarAvaliacoes(8);
        filme1.somarAvaliacoes(7);
        filme1.somarAvaliacoes(9);
        filme1.exibeInformacoes();
        System.out.printf("- Duração em minutos: %d min\n", filme1.getDuracaoEmMinutos());
        System.out.printf("- Média das avaliações: %.2f", filme1.mediaDasAvaliacoes());

        // serie 1
        Serie serie1 = new Serie();
        serie1.setNome("Gossip Girl");
        serie1.setAnoDeLancamento(2007);
        serie1.setIncluidoNoPlano(true);
        serie1.setTemporadas(6);
        serie1.setEpisodiosPorTemporadas(20);
        serie1.setMinutosPorEpisodio(45);
        serie1.setAtiva(false);
        serie1.somarAvaliacoes(3);
        serie1.somarAvaliacoes(9);
        serie1.somarAvaliacoes(5.8);
        serie1.exibeInformacoes();
        System.out.printf("- Duração em minutos: %d min\n", serie1.getDuracaoEmMinutos());
        System.out.printf("- Média de avaliações: %.2f\n", serie1.mediaDasAvaliacoes());

        // exibição de mensagem para tempo de maratonar
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.tempo(filme1);
        calculadora.tempo(serie1);
        System.out.printf("\nTempo para maratonar %s e %s são de %d min ou %.1f horas\n", filme1.getNome(), serie1.getNome(),
                calculadora.getTempoTotal(), calculadora.tempoEmHora());

    }
}
