package javaListaEColecaoDadosAluraAula.exercicios.Exercicio3.HoraDaPratica3.modelos;

public class Animal {
    // 2. Crie uma classe Animal e uma classe Cachorro que herda de Animal.
    //    Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return  this.idade;
    }

}
