package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExampleStreamAPI {
    public static void main(String[] args) {
        List<String> aleatoryNumbers = Arrays.asList("1","0", "1", "10", "23", "11", "7", "90", "6");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        aleatoryNumbers.stream().forEach(System.out::println);
        // aleatoryNumbers.stream().forEach(number -> System.out.println(number));

        System.out.println("  -------------  ");
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        aleatoryNumbers.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("  -------------  ");
        System.out.println("Transforme essa lista de String em uma lista de números inteiros: ");
        aleatoryNumbers.stream().
                map(Integer::parseInt).
                toList().
                forEach(System.out::println);


        System.out.println("  -------------  ");
        System.out.println("Pegue os número pares e maiores que 2, e adicione em uma lista: ");
        List<Integer> list = aleatoryNumbers.stream().map(number -> Integer.parseInt(number)).
                filter(integer -> (integer > 2 && (integer % 2) == 0)).
                collect(Collectors.toList());

        System.out.println(list);

        System.out.println("  -------------  ");
        System.out.println("A média dos números: ");
        aleatoryNumbers.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("  -------------  ");
        System.out.println("Remova os valores impares: ");
        List<Integer> list4 = aleatoryNumbers.stream().map(Integer::parseInt).collect(Collectors.toList());;
        list4.removeIf(integer -> (integer % 2 != 0));
        System.out.println(list4);
    }
}
