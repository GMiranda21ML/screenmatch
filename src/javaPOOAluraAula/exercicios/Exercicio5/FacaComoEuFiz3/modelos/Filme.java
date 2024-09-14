package javaPOOAluraAula.exercicios.Exercicio5.FacaComoEuFiz3.modelos;

public class Filme extends Titulo{
    // atributos
    private String diretor;

    // setters
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // getters
    public String getDiretor() {
        return this.diretor;
    }

    // exibição informações para filme
    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("- Diretor: " + diretor);
    }
}
