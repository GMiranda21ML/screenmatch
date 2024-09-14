package javaPOOAluraAula.exercicios.Exercicio5.FacaComoEuFiz3.modelos;

public class Serie extends Titulo {
    // atributos
    private int temporadas;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodio;
    private boolean ativa;

    // setters
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    // getters
    public int getTemporadas() {
        return this.temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return this.episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return this.minutosPorEpisodio;
    }

    public boolean getAtiva() {
        return this.ativa;
    }

    // status de atividade da serie
    public String statusAtiva() {
        if (ativa) {
            return "Em andamento";
        } else {
            return "Finalizada";
        }
    }

    // adaptando a duração em minutos para as series
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodio;
    }

    // reescrevendo a exibição de informações
    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.printf("""
                - Temporadas: %d
                - Quantidade de episodios por temporada: %d
                - Minutos por episodio: %d min
                - Atividade da série: %s\n""", temporadas, episodiosPorTemporadas, minutosPorEpisodio, statusAtiva());
    }




}
