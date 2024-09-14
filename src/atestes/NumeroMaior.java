package atestes;
import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*
        int i = 0;
        int numMaior = 0;
        while (i < 10) {
            System.out.print("Digite um número: ");
            int num1 = scanner.nextInt();

            if (numMaior < num1) {
                numMaior = num1;
            }
            i++;

        }

        System.out.println("Número mais alto: " + numMaior);
        */

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        int numMenor = num1;

        for (int i = 0; i < 9; i++) {
            if (numMenor > num1) {
                numMenor = num1;
            }

            System.out.print("Digite um número: ");
            num1 = scanner.nextInt();



        }


        System.out.println("Número mais baixo: " + numMenor);




    }
}
