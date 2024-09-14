package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Donnie Darko", 2001);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("The Batman", 2022);
        outroFilme.avalia(10);
        var filmeDoGabriel = new Filme("Us", 2019);
        filmeDoGabriel.avalia(7);
        Serie serie = new Serie("Invencible", 2021);

        Filme f1 = filmeDoGabriel;

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoGabriel);
        lista.add(serie);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) { // não é algo "elegante" de se fazer, porem o instanceof é tipo uma pergunta, item VOCÊ É um filme?
                // e vc ja pergunta e declara a variavel filme
                // ao inves de fazer Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        // outras formas de exibir lista
        // lista.forEach(item -> System.out.println(item));
        // lista.forEach(System.out::println);


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Robert Pattinson");
        buscaPorArtista.add("Cillian Murphy");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);

        System.out.println("Titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Ordenado por ano");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);




    }
}
