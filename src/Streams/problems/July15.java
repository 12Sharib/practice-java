package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class July15 {

  private static void question1() {
//    Return a List<String> of all words that start with 'a', converted to uppercase, and sorted alphabetically.
    List<String> words = List.of("apple", "banana", "cherry", "apricot", "avocado");

    System.out.println(
        words
            .stream()
            .filter(word -> word.startsWith("a"))
            .map(String::toUpperCase)
            .sorted()
            .toList()
    );

  }

  private static void question2() {
//  Return a Map<String, Long> → word → frequency
//  across all sentences. (Each sentence has words separated by spaces.)
    List<String> sentences = List.of(
        "hello world",
        "world of java",
        "hello streams"
    );

    System.out.println(
        sentences
            .stream()
            .flatMap(sen -> Arrays.stream(sen.split(" ")))
            .collect(
                Collectors
                    .groupingBy(
                        Function.identity(),
                        Collectors.counting()
                    )
            )
    );

  }

  public static void main(String[] args) {
//    question1();
    question2();

  }

}
