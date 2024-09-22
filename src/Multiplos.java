import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int num;
        int multi2;
        int multi3;
        int qnt;

        System.out.print("Digite a quantidade de números que queres inserir: ");
        qnt = scanner.nextInt();

        i = 0;
        multi2 = 0;
        multi3 = 0;
        while (i < qnt) {

            System.out.print("Digite um número para ve se ele é multiplo de 2 ou 3: ");
            num = scanner.nextInt();

            if (num % 2 == 0) {
                multi2++;
            }

            if (num % 3 == 0) {
                multi3++;
            }

            i++;
        }

        System.out.printf("%d números são multiplos de 2\n", multi2);
        System.out.printf("%d números são multiplos de 2\n", multi3);








    }
}
