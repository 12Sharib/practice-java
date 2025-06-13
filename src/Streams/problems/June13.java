package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class June13 {

  private static void question1() {
//    Print all names that start with "a", convert them to uppercase, sort by length in descending order, and collect to a list.
    List<String> names = Arrays.asList("aa", "apple", "banana", "avocado", "blueberry", "apricot");

    System.out.println(
        names
            .stream()
            .filter(name -> name.startsWith("a"))
            .sorted(Comparator.comparing(String::length).reversed())
            .map(String::toUpperCase)
            .toList()

    );

  }

  public static void main(String[] args) {
    question1();

  }

}
