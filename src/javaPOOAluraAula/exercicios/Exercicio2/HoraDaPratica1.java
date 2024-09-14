package javaPOOAluraAula.exercicios.Exercicio2;
import java.util.Scanner;


public class HoraDaPratica1 {
    public static void main(String[] args) {

        /*
        1. Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica,
        avaliar a música e calcular a média de avaliações.
        4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        5. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
        Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    
                    HORA DA PRATICA 1!!!
                                    
                    Digite 1 para exemplo 1
                    Digite 2 para exemplo 2
                    Digite 3 para exemplo 3
                    Digite 4 para exemplo 4
                    Digite 5 para exemplo 5
                    Digite 0 para sair""");
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nExemplo 1: ");
                    Pessoa exemplo1 = new Pessoa();
                    exemplo1.mensagem();
                    break;

                case 2:
                    System.out.println("\nExemplo 2: ");
                    Calculadora exemplo2 = new Calculadora();
                    System.out.print("Digite um número: ");
                    double numeroDigitado = scanner.nextDouble();
                    System.out.println(exemplo2.calculo(numeroDigitado));
                    break;

                case 3:
                    System.out.println("\nExemplo 3: ");
                    Musica exemplo3 = new Musica();
                    System.out.print("Digite o Titulo da música: ");
                    scanner.nextLine();
                    // String tituloDigitado = scanner.nextLine(); poderia usar tbm e depois igualar exemplo3.titulo a variavel titulo digitadp
                    exemplo3.titulo = scanner.nextLine();
                    System.out.print("Digite o nome do artista da música: ");
                    // String artistaDigitado = scanner.nextLine(); msm coisa da linha 53
                    exemplo3.artista = scanner.nextLine();
                    System.out.print("Digite o ano de lançamento da música: ");
                    // int anoDeLancamentoDigitado = scanner,nextInt(); msm coisa da linha 53
                    exemplo3.anoDeLancamento = scanner.nextInt();
                    System.out.print("Digite a nota para avaliar a música: ");
                    // double notaDigitada = scanner.nextDouble(); msm coisa da linha 53
                    exemplo3.avaliaMusica(scanner.nextDouble());
                    exemplo3.avaliaMusica(2);
                    exemplo3.avaliaMusica(8);
                    System.out.println("\nFICHA TECNICA");
                    exemplo3.fichaTecnicaExemplo3();
                    System.out.println("Media das avaliações: " + exemplo3.mediaAvaliacoes());
                    break;

                case 4:
                    System.out.println("\nExemplo 4: ");
                    Carro exemplo4 = new Carro();
                    scanner.nextLine();
                    System.out.print("Digite o modelo do seu carro: ");
                    exemplo4.modelo = scanner.nextLine();
                    System.out.print("Digite o ano do seu carro: ");
                    exemplo4.ano = scanner.nextInt();
                    System.out.print("Digite a cor do seu carro: ");
                    scanner.nextLine();
                    exemplo4.cor = scanner.nextLine();
                    exemplo4.fichaTecnicaExemplo4();
                    if (exemplo4.idadeDoCarro() < 0) {
                        System.out.println("Ano do carro invalido! ");
                    } else {
                        System.out.println("Seu carro tem " + exemplo4.idadeDoCarro() + " anos!");
                    }
                    break;

                case 5:
                    System.out.println("\nExemplo 5: ");
                    Aluno exemplo5 = new Aluno();
                    exemplo5.nome = "Gabriel Miranda Mucarbel de Lima";
                    exemplo5.idade = 18;
                    exemplo5.informacoes();
                    break;

                case 0:
                    System.out.println("Saindo.....");
                    return;

                default:
                    System.out.println("Opção invalida, tente novamente!!");

            }


        }
    }
}

