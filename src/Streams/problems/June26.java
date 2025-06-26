package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class June26 {

  private static void question1() {
    List<String> lines = Arrays.asList(
        "apple banana",
        "grape apple",
        "banana orange",
        "orange banana"
    );

    System.out.println(
        lines
            .stream()
            .flatMap(line -> Arrays.stream(line.split(" ")))
            .collect(
                Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                )
            )
    );

  }

  private static void question2() {
//  Find the top 3 largest numbers
//  Return as a List<Integer> in descending order
    List<Integer> numbers = Arrays.asList(5, 10, 20, 15, 30, 25, 40);

    System.out.println(
        numbers
            .stream()
            .sorted(Comparator.reverseOrder())
            .limit(3)
            .sorted()
            .toList()
    );

  }

  private static void question3() {
//  Flatten all characters from the words
//  Count how many times each character appears

    List<String> words = Arrays.asList("apple", "banana", "grape");

    System.out.println(
        words
            .stream()
            .collect(Collectors.joining())
            .chars()
            .mapToObj(x -> (char) x)
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
