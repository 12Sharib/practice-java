package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class June20 {

  private static void question1() {
//    Count how many times each word appears in the entire list.
//Return a Map<String, Long>
    List<String> lines = Arrays.asList(
        "apple banana",
        "grapes apple",
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
    List<Integer> numbers = Arrays.asList(10, 23, 45, 60, 70, 95, 100, 37);

//    Partition the list into two parts:
//    One where numbers are divisible by 5
//    One where they are not

    System.out.println(
        numbers
            .stream()
            .collect(
                Collectors
                    .partitioningBy(x -> x % 5 == 0)
            )
    );
  }

  private static void question3() {
//    Using Stream API:
//    Count how many times each letter appears
//    (i.e., the part before the comma in each string)
//    Return a Map<String, Long>, where:
//    key = letter ("a", "b", "c")
//    value = count of occurrences

    List<String> data = Arrays.asList("a,1", "b,2", "c,3", "a,4", "b,5");

    System.out.println(
        data
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        line -> line.split(",")[0],
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
