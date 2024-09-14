package ProjetoDeMusica.modelos;

public class Audio {
    // atributos
    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private double classificacao;

    // setters e getters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getTotalDeReproducoes() {
        return this.totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return this.totalDeCurtidas;
    }

    public double getClassificacao() {
        return this.classificacao;
    }

    // metodos
    public void curtir() {
        this.totalDeCurtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

}
