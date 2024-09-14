package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Donnie Darko", 2001); // br.com.alura.screenmatch.modelos.Filme = classe
        // meuFilme.setNome("Donnie Darko");
        // meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(113);
        System.out.println("Duração do filme em minutos: " + meuFilme.getDuracaoEmMinutos());
        // System.out.println(meuFilme.nome); // acessar o atributo do objeto (meufilme = objeto; nome = atributo)

        meuFilme.exibeFichaTecnica(); // executando o metodo (um msm estilo de uma funcao em python)
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        // meuFilme.somaDasAvaliacao = 10;
        // meuFilme.totalDeAvaliacoes = 1;
        // System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie("Invencible", 2021);
        // serie.setNome("Invencible");
        // serie.setAnoDeLancamento(2021);
        serie.exibeFichaTecnica();
        serie.setTemporadas(2);
        serie.setEpisodioPorTemporada(8);
        serie.setAtiva(true);
        serie.setMinutosPorEpisodio(40);
        System.out.printf("Duração total de %s: %d minutos\n", serie.getNome(),serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("The Batman", 2022); // br.com.alura.screenmatch.modelos.Filme = classe
        // outroFilme.setNome("The Batman");
        // outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoGabriel = new Filme("Us", 2019); // nesse caso não precisa mais do setNome, mas sera que precisa fazer um setter? na duvida nao faz, so se precisar
        // filmeDoGabriel.setNome("Us");
        // filmeDoGabriel.setAnoDeLancamento(2019);
        filmeDoGabriel.setDuracaoEmMinutos(132);
        filmeDoGabriel.avalia(8);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDoGabriel);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(1).getNome());
        System.out.println(listaDeFilmes);


    }
}
