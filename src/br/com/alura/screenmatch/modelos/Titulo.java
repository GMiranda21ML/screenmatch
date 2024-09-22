package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.execao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    // @SerializedName("Title")
    private String nome;
    // @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) { // se o ano tiver um tamanho superior da 4 caracteres, lançe (= throw) essa exeção
            throw new ErroDeConversaoDeAnoException("Não conseguir converter o ano, porque tem mais de 04 caracteres");
        } else {
             this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        }
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3));
    }

    public String getNome() {
        return this.nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome; // o this é para falar "o nome DESSE objeto" para não confundir as variáveis de msm nome
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

    public void exibeFichaTecnica() { // criando um método
        System.out.printf("Nome do filme: %s\n", nome);
        System.out.printf("Ano de lançamento: %d\n", anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++; // soma mais 1
    }

    public double pegaMedia() {
        return somaDasAvaliacao / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\nAno de lançamento: " + anoDeLancamento + "\nDuração em minutos: " + duracaoEmMinutos + "min";
    }

//    @Override
//    public String toString() {
//        return "nome='" + nome + '\'' +
//                ", anoDeLancamento=" + anoDeLancamento;
//    }

}
