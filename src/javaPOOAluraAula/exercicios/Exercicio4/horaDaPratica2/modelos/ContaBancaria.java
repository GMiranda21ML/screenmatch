package javaPOOAluraAula.exercicios.Exercicio4.horaDaPratica2.modelos;

public class ContaBancaria {
    // 1. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
    //    Implemente métodos getters e setters para os atributos privados.

    // atributos
    private int numeroConta;
    private double saldo;
    public String titular;


    // setters
    public void setNumeroConta(int numeroConta) { // obs: digitei o meu cpf e deu erro pois é necessario um long ao inves de um int
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // getters
    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // informações
    public void informacoesEx1() {
        System.out.printf("""
                - Titular: %s
                - Número da conta: %d
                - Saldo: R$%.2f\n""", titular, numeroConta, saldo);
    }


}
