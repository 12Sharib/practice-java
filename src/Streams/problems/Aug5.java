package Streams.problems;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Aug5 {

  private static void question1() {
//     Print the number of strings that start with "a" and have length greater than 5.
    List<String> names = List.of("apple", "banana", "avocado", "blueberry", "apricot",
        "blackberry");

    System.out.println(
        names
            .stream()
            .filter(s -> s.startsWith("a") && s.length() > 5)
            .count()
    );

  }

  private static void question2() {
//     Print all the cities sorted by length of the city name in ascending order.
    List<String> cities = List.of("Delhi", "Mumbai", "New York", "Amsterdam", "Dubai", "Doha");

    System.out.println(
        cities
            .stream()
            .sorted(
                Comparator.comparing(String::length)
            )
            .toList()
    );

  }

  private static void question3() {
//    Using Java Streams, write a one-liner to print the frequency count of each number in the list, i.e., how many times each number appears.
    List<Integer> numbers = List.of(5, 2, 9, 1, 5, 6, 9, 3, 5);

    System.out.println(
        numbers
            .stream()
            .collect(
                Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                )
            )
    );

  }

  public static void main(String[] args) {
//    question1();
//    question2();
    question3();

  }

}
