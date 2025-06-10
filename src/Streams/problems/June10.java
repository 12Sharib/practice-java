package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class June10 {

  private static void question1() {
// Print a list of names that start with 'a' or 'b', converted to uppercase, sorted in reverse alphabetical order.

    List<String> names = Arrays.asList("alex", "bob", "alice", "adam", "carol", "brad");

    System.out.println(
        names
            .stream()
            .filter(name -> name.startsWith("a") || name.startsWith("b"))
            .map(String::toUpperCase)
            .sorted(Comparator.reverseOrder())
            .toList()
    );
  }

  private static void question2() {
//    Write a stream operation to group words by their first character and count how many words start with each character.
    List<String> words = List.of("apple", "banana", "apricot", "cherry", "blueberry");

    System.out.println(
        words
            .stream()
            .collect(Collectors.groupingBy(
                word -> word.charAt(0),
                Collectors.counting()
            ))
    );

  }

  public static void main(String[] args) {
//    question1();
    question2();

  }

}
