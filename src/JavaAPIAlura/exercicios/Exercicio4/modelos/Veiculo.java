package JavaAPIAlura.exercicios.Exercicio4.modelos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double kmRodados;
    private double preco;

    // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public double getPreco() {
        return preco;
    }

}
