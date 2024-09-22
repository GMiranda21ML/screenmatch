package JavaAPIAlura.exercicios.Exercicio3.execoes;

public class SenhaInvalidaException extends RuntimeException{
    // 2. Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
    // uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos
    // (por exemplo, ter pelo menos 8 caracteres).

    private String mensagem;

    public SenhaInvalidaException (String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
