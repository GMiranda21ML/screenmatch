import java.util.Scanner;

public class Testeeee {
    public static void main(String[] args) {
        int pontos;
        int menorPonto;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Jogador 1, digite a quantidade de pontos que você tem: ");
        pontos = scanner.nextInt();
        menorPonto = pontos;
        for (int i = 2; i <= 4; i++) {

            if (menorPonto > pontos) {
                menorPonto = pontos;
            }

            System.out.printf("Jogador %d, digite a quantidade de pontos que você tem: ", i);
            pontos = scanner.nextInt();
        }

        System.out.println("Menor pontuação: " + menorPonto);

    }
}
