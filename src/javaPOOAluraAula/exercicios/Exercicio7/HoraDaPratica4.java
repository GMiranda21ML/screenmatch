package javaPOOAluraAula.exercicios.Exercicio7;

import javaPOOAluraAula.exercicios.Exercicio7.horaDaPratica.modelos.*;

import java.util.Scanner;

public class HoraDaPratica4 {
    public static void main(String[] args) {

        /*
        1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal()
        para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
        2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea()
        e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
        3. Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número.
        A classe deve receber o número como parâmetro.
        4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
        Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
        5. Crie uma interface Calculavel com um método double calcularPrecoFinal().
        Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
        6. Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos.
        Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                HORA DA PRATICA 4
                
                Digite 1 para o exemplo 1
                Digite 2 para o exemplo 2
                Digite 3 para o exemplo 3
                Digite 4 para o exemplo 4
                Digite 5 para o exemplo 5
                Digite 6 para o exemplo 6
                Digite 0 para sair""");
        System.out.print("Digite sua opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nExemplo 1: ");
                ConversorMoedas exemplo1 = new ConversorMoedas();
                exemplo1.getConverterDolarParaReal(40);
                break;

            case 2:
                System.out.println("\nExemplo 2: ");
                CalculadorSalaRetangular exemplo2 = new CalculadorSalaRetangular();
                exemplo2.getCalcularArea(6, 2);
                exemplo2.getCalcularPerimetro(4, 3);
                break;

            case 3:
                System.out.println("\nExemplo 3: ");
                TabuadaMultiplicacao exemplo3 = new TabuadaMultiplicacao();
                exemplo3.getMostrarTabuada(2);
                break;

            case 4:
                System.out.println("\nExemplo 4: ");
                ConversorTemperaturaPadrao exemplo4 = new ConversorTemperaturaPadrao();
                exemplo4.celciusFahrenheit(26);
                exemplo4.fahrenheitCelcius(78.8);
                break;

            case 5:
                System.out.println("\nExemplo 5: ");
                System.out.println("Resolução da alura + pergunta toda CAGADA");
                break;

            case 6:
                System.out.println("\nExemplo 6: ");
                Produto exemplo6Produto = new Produto();
                exemplo6Produto.setPrecoUnitario(20);
                System.out.printf("Preço do produto: R$%.2f\n", exemplo6Produto.getPrecoUnitario());
                System.out.println("Preço com as quantidades: R$" + exemplo6Produto.getPrecoPorQuantidade(3));
                exemplo6Produto.getAplicarDesconto(15);

                break;
        }



    }
}
