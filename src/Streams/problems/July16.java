package Streams.problems;

import java.util.List;
import java.util.stream.Collectors;

public class July16 {

  private static void question1() {
//   Using Stream API, return a Map<Boolean, List<Integer>> —
//  that partitions the numbers into:
//  true: divisible by 3
//  false: not divisible by 3
    List<Integer> numbers = List.of(4, 5, 6, 7, 8, 9, 10);

    System.out.println(
        numbers
            .stream()
            .collect(
                Collectors
                    .partitioningBy(
                        x -> x % 3 == 0
                    )
            )
    );

  }

  private static void question2() {
//   Using Stream API, return a List<String> of all palindromes
//  (i.e., words that read the same forwards and backwards).
    List<String> words = List.of("level", "java", "radar", "world", "civic", "code");

    System.out.println(
        words
            .stream()
            .filter(value -> new StringBuilder(value).reverse().toString().equals(value))
            .toList()
    );
  }

  private static void question3(){
//  Using Stream API, return a Map<Boolean, List<String>> —
//  partition the names based on whether they start with 'T'.
    List<String> names = List.of("Tom", "Jerry", "Tim", "Bob", "Tina", "John");

    System.out.println(
        names
            .stream()
            .collect(
                Collectors
                    .partitioningBy(
                        value ->value.startsWith("T")
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
