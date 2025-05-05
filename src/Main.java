import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaCEP {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ---------------
                   Busca CEP
                ---------------
                """);

        System.out.println("Digite o CEP: ");
        int cep = scanner.nextInt();

        String viaCepLink = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(viaCepLink))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter writer = new FileWriter("BuscaCEP.json");
        writer.write(gson.toJson(response.body()));
        writer.close();
        System.out.println("Programa finalizado.");

        System.out.println(response.body());

        scanner.close();
    }
}
