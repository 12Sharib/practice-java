package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class June9 {

  private static void question1() {
//     Print the list of words that start with 'a' or 'b', converted to uppercase, and sorted by word length.
    List<String> words = Arrays.asList("banana", "apple", "mango", "avocado", "blueberry");

    System.out.println(
        words
            .stream()
            .filter(value -> value.startsWith("a") || value.startsWith("b"))
            .map(String::toUpperCase)
            .sorted(Comparator.comparing(String::length))
            .toList()
    );
  }

  private static void question2() {
//  Use Stream API to:
//  Filter names starting with "A",
//  Convert them to lowercase,
//  Sort them in reverse order,
//  Collect them into a list.
    List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Brian", "Charlie", "Ankit");

    System.out.println(
        names
            .stream()
            .filter(value -> value.startsWith("A"))
            .map(String::toLowerCase)
            .sorted(Comparator.reverseOrder())
            .toList()
    );

  }

  public static void main(String[] args) {
//    question1();

    question2();
  }

}
