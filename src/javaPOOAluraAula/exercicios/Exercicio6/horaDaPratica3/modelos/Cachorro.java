package javaPOOAluraAula.exercicios.Exercicio6.horaDaPratica3.modelos;

public class Cachorro extends Animal {
    // reescrevendo o método emitir som
    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }

    // método de ação do cachorro
    public void abanarRabo() {
        System.out.println("Abanando rabo!!");
    }


}
