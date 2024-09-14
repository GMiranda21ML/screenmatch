package javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos;

public class Animal {
    // 2. Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal.
    //    Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método.
    //    Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

    // atributos
    private String nome;
    private String raca;

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    // metodo emitir som
    public void emitirSom() {
        System.out.println("Fazendo barulho");
    }




}
