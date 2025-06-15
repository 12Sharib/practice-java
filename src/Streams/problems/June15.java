package Streams.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class June15 {

  private static void question1() {
//    Task:
//    Use Java Stream API to:
//    Filter out even numbers.
//    Square them.
//    Sort them in descending order.
//    Collect them into a list and print the result.

    List<Integer> numbers = Arrays.asList(3, 7, 2, 4, 9, 12, 15, 8, 6);

    System.out.println(
        numbers
            .stream()
            .filter(x -> x % 2 == 0)
            .map(x -> x * x)
            .sorted(Comparator.reverseOrder())
            .toList()
    );
  }

  private static void question2() {
//    Task:
//    Using Stream API:
//    Filter words that start with "a",
//    Convert them to uppercase,
//    Sort them alphabetically,
//    Collect them into a list.

    List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado", "blueberry",
        "apricot");


     List<String> str =    words
            .stream()
            .filter(
                word -> word.startsWith("a")
            )
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());


    System.out.println(str);


  }

  public static void main(String[] args) {
//    question1();
    question2();
  }

}
