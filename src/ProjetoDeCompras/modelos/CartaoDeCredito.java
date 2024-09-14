package ProjetoDeCompras.modelos;

public class CartaoDeCredito {
    private double limite;
    private double saldo;


    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void confirmarCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            System.out.println("Compra feita com sucesso!");
            this.saldo -= compra.getValor();
        } else {
            System.out.println("Impossível efetuar a compra, pois o valor é maior do que o saldo");
        }
    }




}
