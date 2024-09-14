package javaPOOAluraAula.exercicios.Exercicio4.horaDaPratica2.modelos;

public class IdadePessoa {
    // 2. Crie uma classe idadePessoa com os atributos privados nome e idade.
    //    Utilize métodos getters e setters para acessar e modificar esses atributos.
    //    Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

    // atributos
    private String nome;
    private int idade;

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    // verificar a idade
    public void verificarIdade() {
        if (idade < 0) {
            System.out.println("Idade indisponível");
        } else if (idade < 18) {
            System.out.printf("%s é menor de idade\n", nome);
        } else {
            System.out.printf("%s é maior de idade\n", nome);
        }
    }

    // informações
    public void informacoesEx2() {
        System.out.printf("""
                - Nome: %s
                - idade: %d anos\n""", nome, idade);
    }
}
