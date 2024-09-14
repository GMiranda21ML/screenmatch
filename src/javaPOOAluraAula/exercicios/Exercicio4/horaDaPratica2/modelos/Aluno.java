package javaPOOAluraAula.exercicios.Exercicio4.horaDaPratica2.modelos;

public class Aluno {
    // 4. Desenvolva uma classe Aluno com os atributos privados nome e notas.
    //    Utilize métodos getters e setters para acessar e modificar esses atributos.
    //    Adicione um método calcularMedia que retorna a média das notas do aluno.

    // atributos
    private String nome;
    private double nota;
    private int totalDeNotas;

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public double getNota() {
        return this.nota;
    }

    // calcular media
    public void somaDasNotas(double notas) {
        nota += notas;
        totalDeNotas++;
    }

    public double calcularMedia() {
        return nota/totalDeNotas;

    }

}
