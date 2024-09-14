package javaListaEColecaoDadosAluraAula.exercicios.Exercicio1.HoraDaPratica1.modelos;

public class Pessoa {
    // 1. Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.

    // atributos
    private String nome;
    private int idade;

    // setters e getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    // reescrevendo o metodo toString da classe mae de todas object
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " idade: " + this.getIdade();
    }




}
