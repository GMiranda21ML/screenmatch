package javaPOOAluraAula.exercicios.Exercicio1;

public class ScreenMatch {
    public static void main(String[] args) {
        Filmee filmes = new Filmee();
        filmes.nome = "The Batman";
        filmes.anoDeLancamento = 2022;
        filmes.duracaoEmMinutos = 176;
        filmes.incluidoNoPlano = true;

        filmes.exibeFichaTecnica();
        filmes.avalia(5);
        filmes.avalia(5);
        filmes.avalia(5);
        System.out.println(filmes.somaDasAvaliacoes);
        System.out.println(filmes.pegaMedia());

    }
}
