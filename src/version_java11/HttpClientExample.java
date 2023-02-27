package src.version_java11;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class HttpClientExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .build();                    // la méthode build() est appelée pour créer l'objet HttpRequest

        // Cette méthode retourne un objet CompletableFuture qui peut être utilisé pour traiter la réponse.
        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, // a méthode sendAsync() est appelée pour envoyer la requête de manière asynchrone.
                HttpResponse.BodyHandlers.ofString());

        future.thenAccept(response -> { // La méthode thenAccept() est appelée sur l'objet CompletableFuture pour spécifier l'action à effectuer une fois que la réponse est reçue.

            System.out.println(response.statusCode());
            System.out.println(response.body());

        });
    }

    public static void main2(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        String requestBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        future.thenAccept(response -> {
            System.out.println(response.statusCode());
            System.out.println(response.body());
        });
    }


}

