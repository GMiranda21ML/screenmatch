package javaListaEColecaoDadosAluraAula.exercicios.Exercicio3.HoraDaPratica3.modelos;

public class ContaBancaria {
    // 6. Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
    //    Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
