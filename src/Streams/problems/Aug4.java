package Streams.problems;

import java.util.List;
import java.util.stream.Collectors;

public class Aug4 {

  private static void question1() {
//    Using Stream API, collect words into a Map where:
//    The key is the first letter of the word.
//    The value is the count of words starting with that letter
    List<String> words = List.of("apple", "banana", "cherry", "avocado", "apricot", "blueberry");

    System.out.println(
        words
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        x -> x.charAt(0),
                        Collectors.counting()
                    )
            )
    );

  }

  private static void question2() {
//    Using Stream API, filter out the words starting with 'a', convert them to uppercase, and collect into a list.
    List<String> words = List.of("banana", "apple", "grape", "apricot", "blueberry", "avocado");

    System.out.println(
        words
            .stream()
            .filter(x -> x.startsWith("a"))
            .map(String::toUpperCase)
            .toList()
    );

  }

  private static void question3() {
//    Use Stream API to count how many phrases contain the word "java"
    List<String> phrases = List.of("java is cool", "stream api", "java streams", "cool feature");

    System.out.println(
        phrases
            .stream()
            .filter(x -> x.contains("java"))
            .count()
    );

  }

  public static void main(String[] args) {
//    question1();
//    question2();
    question3();

  }

}
