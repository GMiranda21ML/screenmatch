package javaPOOAluraAula.exercicios.Exercicio4.horaDaPratica2.modelos;

public class Livro {
    // 5. Desenvolva uma classe Livro com os atributos privados titulo e autor.
    //    Utilize métodos getters e setters para acessar e modificar esses atributos.
    //    Adicione um método exibirDetalhes que imprime o título e o autor do livro.

    // atributos
    private String titulo;
    private String autor;

    // ngc que n aprendi ainda mas parece ser legal
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    // informações
    public void informacoes() {
        System.out.printf("""
                - Titulo do livro: %s
                - Autor do livro: %s
                \n""", titulo, autor);
    }
}
