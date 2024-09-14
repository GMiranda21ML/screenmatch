package javaPOOAluraAula.exercicios.Exercicio3;
import javaPOOAluraAula.exercicios.Exercicio3.facaComoEuFiz2.modelos.FilmeEx3;

public class PrincipalEx3 {

    public static void main(String[] args) {
        FilmeEx3 filme = new FilmeEx3();
        filme.setNome("Por um punhado de dólares");
        filme.setAnoDeLancamento(1964);
        filme.setDuracaoEmMinutos(100);
        filme.setIncluidoNoPlano(true);

        filme.avalia(9);
        filme.avalia(8);
        filme.avalia(9);

        filme.fichaTecnica();
        System.out.printf("Média das avaliações: %.2f", filme.mediaAvaliacoes());

    }
}
