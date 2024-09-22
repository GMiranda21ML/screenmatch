package br.com.alura.screenmatch.execao;

public class ErroDeConversaoDeAnoException extends RuntimeException { // se eu usar extends Throwable, a exeção é obrigatorio, tipo throws IOException, InterruptedException
    // Runtime Exceptions são exceções não declaradas. Em geral, elas representam condições de erro que não são previstas pelo aplicativo.
    // Service Runtime Exceptions são utilizadas para sinalizar uma condição inesperada no tempo de execução.
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }

}
