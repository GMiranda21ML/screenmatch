package javaPOOAluraAula.exercicios.Exercicio2;

public class Aluno {
    //      5. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
    //         Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

    String nome;
    int idade;

    void informacoes() {
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
    }

}
