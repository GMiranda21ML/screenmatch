package ProjetoDeMusica.Main;

import ProjetoDeMusica.modelos.Avaliacoes;
import ProjetoDeMusica.modelos.Musica;
import ProjetoDeMusica.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Brooklyn baby");
        musica.setArtista("Lana del rey");
        musica.setAlbum("Ultraviolence");
        musica.setGenero("Indie rock");
        for (int i = 0; i < 3000; i++) {
            musica.reproduzir();
        }
        musica.getExibirInformacoes();

        Podcast podcast = new Podcast();
        podcast.setTitulo("Carlos Melo - Ciência Sem Fim #228");
        podcast.setApresentador("Sérgio Sacani");
        podcast.setDescricao("Sérgio Sacani fala com o engenheiro de visão computacional e mestre em engenharia aeroespacial, Carlos Melo!");
        for (int i = 0; i < 1000; i++) {
            podcast.curtir();
        }
        podcast.getExibirInformacoes();


        Avaliacoes avaliacoes = new Avaliacoes();
        System.out.println("~~~AVALIAÇÕES~~~");
        avaliacoes.avaliar(musica);
        avaliacoes.avaliar(podcast);

    }
}
