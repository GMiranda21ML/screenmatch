package javaPOOAluraAula.exercicios.Exercicio2;

public class Musica {
    // 3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica,
    //    avaliar a música e calcular a média de avaliações.

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacao;

    void fichaTecnicaExemplo3() {
        System.out.printf("Titulo da música: %s\n", titulo);
        System.out.printf("Artista: %s\n", artista);
        System.out.printf("Ano de lançamento: %d\n", anoDeLancamento);
    }

    void avaliaMusica(double nota) {
        avaliacao += nota;
        numAvaliacao++;
    }

    double mediaAvaliacoes() {
        return avaliacao / numAvaliacao;
    }

}

