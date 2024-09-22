package JavaAPIAlura.exercicios.Exercicio3.modelos;

public record Exemplo3(String login, String id, String avatar_url, String url) {
    @Override
    public String toString() {
        return "Login: " + login + "\nID: " + id + "\nUrl do avatar: " + avatar_url + "\nURL: " + url;
    }
}
