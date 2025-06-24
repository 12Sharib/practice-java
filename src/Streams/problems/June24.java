package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class June24 {

  private static void question1() {
//    Count how many times each word appears
//  Return a Map<String, Long> (word → count)
    List<String> words = Arrays.asList("banana", "apple", "orange", "apple", "banana", "grape",
        "banana");

    System.out.println(
        words
            .stream()
            .collect(
                Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                )
            )
    );

  }

  private static void question2() {
//    Extract the domain from each email (i.e., part after @)
//Count how many emails belong to each domain
//Return a Map<String, Long>
    List<String> data = Arrays.asList("john@gmail.com", "amy@yahoo.com", "bob@gmail.com",
        "rick@yahoo.com", "eva@outlook.com");

    System.out.println(
        data
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        d -> d.split("@")[1],
                        Collectors.counting()
                    )
            )
    );
  }

  public static void main(String[] args) {
//    question1();
    question2();

  }

}
