package src.version_java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmeliorationStreams {


    public static void main(String[] args) {



    /*
         La méthode "dropWhile()"
         : permet de supprimer des éléments du flux tant qu'une condition donnée est vraie.   Par exemple, si vous avez un flux de nombres et que vous voulez supprimer
         tous les nombres inférieurs à 10,    vous pouvez utiliser la méthode "dropWhile()" de la manière suivante :
     */
        List<Integer> numbers0 = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        List<Integer> filtered0 = numbers0.stream()
                .dropWhile(n -> n < 10)
                .collect(Collectors.toList());

    /*
    La méthode "takeWhile()"
    permet de sélectionner des éléments du flux tant qu'une condition donnée est vraie.  Par exemple, si vous avez un flux de nombres et
    que vous voulez sélectionner tous les nombres inférieurs à 10,      vous pouvez utiliser la méthode "takeWhile()" de la manière suivante :
     */

        List<Integer> numbers1 = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        List<Integer> filtered1 = numbers1.stream()
                .takeWhile(n -> n < 10)
                .collect(Collectors.toList());

        /*
        La méthode "ofNullable()"
        permet de créer un flux à partir d'un objet qui peut être null. Si l'objet est null, la méthode renvoie un flux vide, sinon elle renvoie un flux avec l'objet.
        Par exemple, si vous voulez créer un flux à partir d'une chaîne de caractères qui peut être null, vous pouvez utiliser la méthode "ofNullable()" de la manière suivante :
         */
        String str = "Hello, world!";
        Stream<String> stream1 = Stream.ofNullable(str); // le flux contiendra la chaîne "Hello, world!"
        Stream<String> stream2 = Stream.ofNullable(null); // le flux sera vide

    }
}
