package javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos;

public class ContaCorrente extends ContaBancaria {

    // método de tarifa mensal
    public void cobrarTarifaMensal(double tarifa) {
        this.saldo -= (this.saldo * (tarifa/100));
        System.out.println("Tarifa mensal: " + this.saldo * (tarifa/100) + " Novo saldo: R$" + saldo);
    }
}
