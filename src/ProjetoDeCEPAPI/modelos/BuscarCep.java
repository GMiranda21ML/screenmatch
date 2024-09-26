package ProjetoDeCEPAPI.modelos;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarCep {

    public EnderecoComCep buscarEndereco(String cep) throws IOException, InterruptedException {
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), EnderecoComCep.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel obter esse CEP e achar o endereco!");
        }



    }



}
