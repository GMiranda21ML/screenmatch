package javaPOOAluraAula.exercicios.Exercicio6;

import javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos.Cachorro;
import javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos.ContaCorrente;
import javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos.Gato;
import javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos.ModeloCarro;
import javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos.VerificadorPrimo;
import javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos.GeradorPrimo;
import javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos.NumerosPrimos;
import java.util.Scanner;


public class HoraDaPratica3 {
    public static void main(String[] args) {

        /*
        1. Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
        Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
        Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
        2. Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal.
        Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método.
        Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
        3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
        Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
        Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
        4. Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos().
        Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos.
        Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo()
        para o GeradorPrimo.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                HORA DA PRÁTICA 3
                
                Digite 1 para o exemplo 1
                Digite 2 para o exemplo 2
                Digite 3 para o exemplo 3
                Digite 4 para o exemplo 4
                Digite 0 para sair""");
        System.out.print("Digite sua opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nExemplo 1: ");
                ModeloCarro modeloCarro = new ModeloCarro();
                modeloCarro.setModelo("HB20");
                modeloCarro.definirPrecos(70000, 65000, 80000);
                modeloCarro.setMarcaDoCarro("Hyundai");
                modeloCarro.setTipo("Manual");
                modeloCarro.setQuantidadeDePortas(4);
                modeloCarro.exibeInformacoes();
                break;

            case 2:
                System.out.println("\nExemplo 2: ");
                Cachorro cachorro = new Cachorro();
                cachorro.setNome("Simba");
                cachorro.setRaca("Spintz alemão");
                System.out.printf("Nome do Cachorro %s, é da raça %s!\n", cachorro.getNome(), cachorro.getRaca());
                cachorro.emitirSom();
                cachorro.abanarRabo();

                Gato gato = new Gato();
                gato.setNome("Rabicho");
                gato.setRaca("Gato peludo");
                System.out.printf("Nome do Gato %s, é da raça %s!\n", gato.getNome(), gato.getRaca());
                gato.emitirSom();
                gato.arranharMoveis();
                break;

            case 3:
                System.out.println("\nExemplo 3: ");
                ContaCorrente conta = new ContaCorrente();
                conta.consultarSaldo();
                conta.setSaldo(1000);
                conta.depositar(500);
                conta.consultarSaldo();
                conta.sacar(200);
                System.out.println("Digite o valor do seu saque");
                conta.sacar(scanner.nextDouble());
                conta.consultarSaldo();
                conta.cobrarTarifaMensal(15);
                break;

            case 4:
                System.out.println("\nExemplo 4: ");
                VerificadorPrimo verificador = new VerificadorPrimo();
                verificador.verificarSeEhPrimo(17);

                GeradorPrimo gerador = new GeradorPrimo();
                int proximoPrimo = gerador.gerarProximoPrimo(17);
                System.out.println("O próximo primo após 17 é: " + proximoPrimo);

                NumerosPrimos numerosPrimos = new NumerosPrimos();
                numerosPrimos.listarPrimos(30);
                break;
        }






    }
}
