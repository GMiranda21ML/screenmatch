package javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos;

public class ContaBancaria {
    // 3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
    //    Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
    //    Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

    // atributos
    protected double saldo;

    // setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // getters
    public double getSaldo() {
        return this.saldo;
    }

    // método de deposito
    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    // método de saque
    public void sacar(double saque) {
        if (saldo < saque) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            saldo -= saque;
            System.out.printf("Saque de R$%.2f feito com sucesso\n", saque);
        }
    }

    // método para consultar o saldo
    public void consultarSaldo() {
        System.out.printf("Saldo Atual: R$%.2f\n", this.saldo);
    }

}
