package javaPOOAluraAula.exercicios.Exercicio5.FacaComoEuFiz3.modelos;

public class Titulo {
    // atributos
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    // status incluido do plano
    public String status() {
        if (incluidoNoPlano) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    // exibir as informações
    public void exibeInformacoes() {
        System.out.printf("""
                
                INFORMAÇÕES:
                
                - Nome: %s
                - Ano de lançamento: %d
                - Incluido no plano: %s\n""", this.nome, this.anoDeLancamento, status());
    }

    // soma das avaliações
    public void somarAvaliacoes(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // media das avaliações
    public double mediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
