package javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos;

public class ModeloCarro extends Carro {
    // atributos adicionais
    private String marcaDoCarro;
    private String tipo;
    private int quantidadeDePortas;

    // setters
    public void setMarcaDoCarro(String marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    // reescrita das informações
    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.printf("""
                - Marca do carro: %s
                - Tipo: %s
                - Quantidade de portas: %d\n""", marcaDoCarro, tipo, quantidadeDePortas);
    }

}
