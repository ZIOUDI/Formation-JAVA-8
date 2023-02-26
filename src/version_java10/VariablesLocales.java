package src.version_java10;

import java.util.List;
import java.util.stream.Collectors;

public class VariablesLocales {

    public static void main(String[] args) {

        var message = "Hello, world!";
        System.out.println(message);

        var numbers = List.of(1, 2, 3, 4, 5);

        for (var number : numbers) {
            System.out.println(number);
        }

         var evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);


    }


}
