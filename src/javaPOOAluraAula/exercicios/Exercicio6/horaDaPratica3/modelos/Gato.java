package javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos;

public class Gato extends Animal {
    // reescrevendo o método emitir som
    @Override
    public void emitirSom() {
        System.out.println("MIAU");
    }

    // método de ação do gato
    public void arranharMoveis() {
        System.out.println("Arranhando moveis!!");
    }
}
