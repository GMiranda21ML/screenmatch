package javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos;

public class Carro {

    // 1. Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
    //    Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
    //    Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

    // atributos
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    // setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double preco1, double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    // getters
    public String getModelo() {
        return this.modelo;
    }

    public double getPreco1() {
        return this.preco1;
    }

    public double getPreco2() {
        return this.preco2;
    }

    public double getPreco3() {
        return this.preco3;
    }

    // retornar maior preço
    public double exibeMaiorPreco() {
        double maiorpreco = this.preco1;

        if (maiorpreco < this.preco2) {
            maiorpreco = preco2;
        }

        if (maiorpreco < preco3) {
            maiorpreco = preco3;
        }

        return maiorpreco;

    }

    // retornar menor preço
    public double exibeMenorPreco() {
        double menorPreco = this.preco1;

        if (menorPreco > this.preco2) {
            menorPreco = preco2;
        }

        if (menorPreco > this.preco3) {
            menorPreco = preco3;
        }

        return menorPreco;

    }

    // exibir informações
    public void exibeInformacoes() {
        System.out.printf("""
                Informações
                
                - Modelo: %s
                - Preço Ano 1: R$%.2f
                - Preço Ano 2: R$%.2f
                - Preço Ano 3: R$%.2f
                - Maior preço: R$%.2f
                - Menor preço: R$%.2f\n""", modelo, preco1, preco2, preco3, exibeMaiorPreco(), exibeMenorPreco());
    }

}
