package ProjetoDeMusica.modelos;

import ProjetoDeMusica.interfaces.Informacoes;

public class Musica extends Audio implements Informacoes {
    // atributos
    private String artista;
    private String album;
    private String genero;

    // setters e getters
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    // reescrita da classificacao
    @Override
    public double getClassificacao() {
        if (this.getTotalDeReproducoes() >= 2500) {
            return 10;
        } else if (this.getTotalDeReproducoes() >= 1500){
            return 6;
        } else {
            return 2;
        }
    }

    // reescrita da exibição de informações gerado na interface
    @Override
    public void getExibirInformacoes() {
        System.out.printf("""
                ~~~MÚSICA~~~
                - Título da música: %s
                - Nome do(a) artista: %s
                - Albúm: %s
                - Gênero: %s
                - Total de reproduções: %d
                \n""", this.getTitulo(), this.artista, this.album, this.genero, this.getTotalDeReproducoes());
    }

}
