package ProjetoDeMusica.modelos;

public class Avaliacoes {
    // metodo para avaliar as subclasses
    public void avaliar(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.printf("%s é o mais ouvido no mundo!\n", audio.getTitulo());
        } else if (audio.getClassificacao() >= 5) {
            System.out.printf("%s, muito bom! todos estão adorando!\n", audio.getTitulo());
        } else {
            System.out.printf("%s, exite melhores, vá ouvir algo melhor\n", audio.getTitulo());
        }
    }
}
