package Streams.problems;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class July21 {

  private static void question1() {
//     Using Stream API, count the occurrences of each string and print the result as a Map<String, Long>.
    List<String> values = List.of("sun", "moon", "sun", "star", "moon", "star", "sun");
    System.out.println(
        values
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Function.identity(),
                        Collectors.counting()
                    )
            )
    );

  }

  private static void question2() {
//     Using Stream API, group the words by their first letter and return a Map<Character, List<String>>.
    List<String> words = List.of("apple", "banana", "apricot", "blueberry", "avocado");

    System.out.println(
        words
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        x -> x.charAt(0)
                    )
            )
    );

  }

  public static void main(String[] args) {
//    question1();
    question2();


  }

}
