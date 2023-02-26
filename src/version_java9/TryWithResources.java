package src.version_java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {




    public static void main(String[] args) {


        /*
    L'API Try-With-Resources est une fonctionnalité de Java qui permet de simplifier la gestion des ressources dans les blocs try-catch-finally.
    Elle garantit que les ressources sont correctement fermées, même en cas d'exception, sans avoir besoin d'écrire explicitement des blocs de code de fermeture.
 */


        //  objet BufferedReader est créé à l'intérieur de la déclaration du bloc try.
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            /*
             Cet objet est ensuite utilisé pour lire le contenu du fichier "file.txt" ligne par ligne, et chaque ligne est affichée à la console. À la fin du bloc try,
             l'objet BufferedReader est automatiquement fermé grâce à l'API Try-With-Resources, sans avoir besoin d'écrire explicitement un bloc de code de fermeture.
             */
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
