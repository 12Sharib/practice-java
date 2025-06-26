package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class June27 {

  private static void question1() {
//    Count how many times each character appears (excluding spaces)
    String sentence = "banana apple orange mango banana apple";

    System.out.println(
        sentence
            .chars()
            .mapToObj(
                x -> (char) x
            )
            .filter(x -> x != ' ')
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
//  Flatten all numbers from the strings
//  Parse to integers
//  Find the sum of all numbers
    List<String> lines = Arrays.asList(
        "5 10 15",
        "20 25",
        "30"
    );

    System.out.println(
        lines
            .stream()
            .flatMap(x -> Arrays.stream(x.split(" ")))
            .mapToInt(Integer::parseInt)
            .reduce(Integer::sum)
    );

  }

  private static void question3() {
//  Flatten all the words
//  Remove duplicates
//  Sort them alphabetically
//  Collect into a List<String>
    List<String> data = Arrays.asList(
        "apple banana",
        "grape apple",
        "banana mango",
        "kiwi grape"
    );

    System.out.println(
        data
            .stream()
            .flatMap(
                x -> Arrays.stream(x.split(" "))
            )
            .distinct()
            .sorted()
            .toList()
    );

  }

  public static void main(String[] args) {
//    question1();
//    question2();
    question3();

  }

}
