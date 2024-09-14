package ProjetoDeMusica.modelos;

import ProjetoDeMusica.interfaces.Informacoes;

public class Podcast extends Audio implements Informacoes {
    // atributos
    private String apresentador;
    private String descricao;

    // setters e getters
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getApresentador() {
        return this.apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    // reescrita da classificacao
    @Override
    public double getClassificacao() {
        if (this.getTotalDeCurtidas() >= 1500) {
            return 10;
        } else if (this.getTotalDeCurtidas() >= 750){
            return 6;
        } else {
            return 3;
        }
    }

    // reescrita da exibição de informações gerado na interface
    @Override
    public void getExibirInformacoes() {
        System.out.printf("""
                ~~~PODCAST~~~
                - Titulo do Podcast: %s
                - Apresentador: %s
                - Descrição: %s
                - Total de curtidas: %d
                \n""", this.getTitulo(), this.apresentador, this.descricao, this.getTotalDeCurtidas());
    }


}
