package javaPOOAluraAula.exercicios.Exercicio4.horaDaPratica2.modelos;

public class Produto {
    // 3. Desenvolva uma classe Produto com os atributos privados nome e preco.
    //    Utilize métodos getters e setters para acessar e modificar esses atributos.
    //    Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

    // atributos
    private String nome;
    private double preco;

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    // metodo de aplicação de desconto
    public double aplicarDesconto(double desconto) {
        double novoPreco = preco * desconto/100;
        preco -= novoPreco;
        return preco;
    }

    // informações
    public void informacoesEx3() {
        System.out.printf("""
                - Nome do produto: %s
                - Preço do produto: R$%.2f\n""", nome, preco);
    }

}
