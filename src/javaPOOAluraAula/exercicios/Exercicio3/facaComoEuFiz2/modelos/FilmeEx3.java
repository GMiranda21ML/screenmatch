package javaPOOAluraAula.exercicios.Exercicio3.facaComoEuFiz2.modelos;

public class FilmeEx3 {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    // setters, atribuição de valores aos atributos
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

    // getters, obter e retornar os valores "setados" anteriormente
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

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    // exibir confirmação de inclusão no plano mais legivel
    public String status() {
        if (incluidoNoPlano) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    // metodo de exibição de informações
    public void fichaTecnica() {
        System.out.printf("""
                
                FICHA TECNICA
                
                - Nome do filme: %s
                - Ano de lançamento: %d
                - Duração do filme: %d minutos
                - incluido no plano: %s\n""", nome, anoDeLancamento, duracaoEmMinutos, status());
    }

    // metodo que calcula as avaliações
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // metodo que calcula a media das avaliações
    public double mediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;

    }
}
