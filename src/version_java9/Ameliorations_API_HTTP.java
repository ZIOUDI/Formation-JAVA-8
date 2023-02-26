package src.version_java9;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Ameliorations_API_HTTP {



    /*
    L'API HTTP est une nouvelle fonctionnalité de Java 9 qui permet de créer et d'envoyer des requêtes HTTP et de traiter les réponses HTTP.
    Voici un exemple d'utilisation de l'API HTTP pour envoyer une requête GET à un serveur web :
     */



    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient(); // un objet HttpClient est créé
        HttpRequest request = HttpRequest.newBuilder() //  une requête HTTP GET est créée
                .uri(URI.create("http://example.com")) // spécifier l'URL de la ressource à récupérer
                .GET()                                  // spécifier que la méthode de la requête est GET.
                .build();
        HttpResponse<String> response = client.send(request,  // La requête est ensuite envoyée  en appelant la méthode "client.send()",
                HttpResponse.BodyHandlers.ofString());       // le corps de la réponse doit être traité comme une chaîne de caractères.
        System.out.println(response.body());
    }
}
