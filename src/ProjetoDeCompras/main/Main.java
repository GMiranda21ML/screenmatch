package ProjetoDeCompras.main;

import ProjetoDeCompras.modelos.CartaoDeCredito;
import ProjetoDeCompras.modelos.Compra;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<Compra> listaDeCompras = new LinkedList<>();

        System.out.println("""
                
                ╭━━╮╭━━━┳━╮╭━╮╭╮╱╱╭┳━━┳━╮╱╭┳━━━┳━━━╮
                ┃╭╮┃┃╭━━┫┃╰╯┃┃┃╰╮╭╯┣┫┣┫┃╰╮┃┣╮╭╮┃╭━╮┃
                ┃╰╯╰┫╰━━┫╭╮╭╮┃╰╮┃┃╭╯┃┃┃╭╮╰╯┃┃┃┃┃┃╱┃┃
                ┃╭━╮┃╭━━┫┃┃┃┃┃╱┃╰╯┃╱┃┃┃┃╰╮┃┃┃┃┃┃┃╱┃┃
                ┃╰━╯┃╰━━┫┃┃┃┃┃╱╰╮╭╯╭┫┣┫┃╱┃┃┣╯╰╯┃╰━╯┃
                ╰━━━┻━━━┻╯╰╯╰╯╱╱╰╯╱╰━━┻╯╱╰━┻━━━┻━━━╯
                """);

        System.out.print("Digite o limite do cartão: ");
        Double limite = scanner.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int i = 1;
        while (i != 0) {
            System.out.print("Digite a descrição da compra: ");
            String descricao = scanner.next();
            System.out.print("Digite o valor da compra: ");
            double valor = scanner.nextDouble();
            Compra compra = new Compra(descricao, valor);

            cartaoDeCredito.confirmarCompra(compra);

            System.out.print("\nDigite 1 para continuar, Digite 0 para sair: ");
            i = scanner.nextInt();


            if (cartaoDeCredito.getSaldo() >= compra.getValor()) {
                listaDeCompras.add(compra);
            }

        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("COMPRAS REALIZADAS: ");

        Collections.sort(listaDeCompras);
        for (Compra item : listaDeCompras) {
            System.out.println(item);
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.printf("Saldo no cartão restante: R$%.2f\n", cartaoDeCredito.getSaldo());


    }
}
