package ProjetoDeCEPAPI.modelos;

public record EnderecoComCep(String cep, String logradouro, String bairro,
                             String localidade, String uf, int ddd) {

    @Override
    public String toString() {
        return "CEP: " + this.cep + "\nLogradouro: " + this.logradouro + "\nBairro: " + this.bairro +
                "\nLocalidade: " + this.localidade + "\nUF: " + this.uf + "\nDDD: " + this.ddd;
    }
}
