package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class June18 {

  private static void question1() {
//  Filter numbers divisible by 3
//Square them
//Collect into a list sorted in ascending order
    List<Integer> numbers = Arrays.asList(5, 12, 19, 21, 7, 10, 15, 9);

    System.out.println(numbers
        .stream()
        .filter(x -> x % 3 == 0)
        .map(x -> x * x)
        .sorted()
        .toList());

  }

  private static void question2() {
//    Group by the first character
//Collect a Map<String, List<String>> with the grouped values

    List<String> data = Arrays.asList("a1", "b2", "a3", "c4", "b5", "a6", "c7");

    System.out.println(
        data
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        s->s.charAt(0)
                    )
            )
    );

  }

  public static void main(String[] args) {
//    question1();
    question2();

  }

}
