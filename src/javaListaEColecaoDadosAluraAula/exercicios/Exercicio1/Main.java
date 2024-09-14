package javaListaEColecaoDadosAluraAula.exercicios.Exercicio1;

import javaListaEColecaoDadosAluraAula.exercicios.Exercicio1.HoraDaPratica1.modelos.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        1. Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
        2. No método main da classe br.com.alura.screenmatch.principal.Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
        3. Adicione pelo menos três pessoas à lista utilizando o método add.
        4. Imprima o tamanho da lista utilizando o método size.
        5. Imprima a primeira pessoa da lista utilizando o método get.
        6. Imprima a lista completa
         */

        var pessoa1 = new Pessoa();
        pessoa1.setNome("Gabriel");
        pessoa1.setIdade(18);

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Giovana");
        pessoa2.setIdade(17);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        System.out.printf("Número de pessoas da lista: %d\n", listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }


    }
}
