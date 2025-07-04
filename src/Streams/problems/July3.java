package Streams.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class July3 {

  private static void question1() {
//  Create a list of distinct words
//  Sort them alphabetically
//  Make the final list unmodifiable
    List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");

    final List<String> collect =
        words
            .stream()
            .distinct()
            .sorted()
            .collect(
                Collectors.collectingAndThen(
                    Collectors.toList(),
                    Collections::unmodifiableList
                )
            );

    System.out.println(collect);


  }

  private static void question2() {
//  Find the sum of numbers
//  Find the count of numbers
//  Return the average as a double
    List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

    Double collect = numbers
        .stream()
        .collect(
            Collectors.teeing(
                Collectors.summingInt(Integer::intValue),
                Collectors.counting(),
                (sum, count) -> sum / (double) count
            )
        );
    System.out.println(collect);


  }

  private static void question3() {
//    Group data by name
//  For each person, calculate:
//    Total salary
//    Number of entries
//    Average salary
    List<String> data = Arrays.asList(
        "John,50000",
        "Alice,70000",
        "Bob,60000",
        "John,55000",
        "Alice,75000",
        "Bob,65000"
    );

    final Map<String, Object> collect = data
        .stream()
        .collect(
            Collectors.groupingBy(
                d -> d.split(",")[0],
                Collectors
                    .collectingAndThen(
                        Collectors.teeing(
                            Collectors.summingInt(d -> Integer.parseInt(d.split(",")[1])),
                            Collectors.counting(),
                            (sum, count) -> sum / (double) count
                        ),
                        Function.identity()
                    )
            )
        );

    System.out.println(collect);

  }

  public static void main(String[] args) {
//    question1();
//    question2();
    question3();

  }

}
