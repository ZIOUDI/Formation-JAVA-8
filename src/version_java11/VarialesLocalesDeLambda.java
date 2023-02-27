package src.version_java11;

import java.util.*;
import java.util.function.Consumer;

public class VarialesLocalesDeLambda {

    public static void main(String[] args) {

/*
les variables locales peuvent être utilisées dans les expressions lambda sans avoir à être déclarées comme finales.
 */

        // exemple 1
        List<String> _list = Arrays.asList("un", "deux", "trois", "quatre");
        List<String> result = new ArrayList<>();
        _list.forEach((var element) -> {
            if (element.length() > 3) {
                result.add(element);
            }
        });

        // exemple 2
        Map<String, Integer> map = new HashMap<>();
        map.put("un", 1);
        map.put("deux", 2);
        map.put("trois", 3);
        map.put("quatre", 4);
        map.forEach((var key, var value) -> {
            System.out.println("Clé : " + key + ", Valeur : " + value);
        });

        // exemple 3
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int sum = list.stream()
                .filter((var number) -> number % 2 == 0)
                .mapToInt((var number) -> number)
                .sum();
        System.out.println("Somme des nombres pairs : " + sum);


    }
}
