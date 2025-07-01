package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class July2 {

  private static void question1() {
//    Partition the numbers into two groups:
//    One group: divisible by 3
//    Another group: not divisible by 3
    List<Integer> numbers = Arrays.asList(3, 5, 8, 10, 15, 18, 21, 24);

    System.out.println(
        numbers
            .stream()
            .collect(
                Collectors
                    .partitioningBy(
                        num -> num % 3 == 0
                    )
            )
    );
  }

  private static void question2() {
//    Partition the names into two groups:
//    Names that start with 'T'
//    Others
//    Return a map with counts of names in each group
    List<String> names = Arrays.asList("Tom", "Jerry", "Tim", "Sam", "Tina", "Rob");

    System.out.println(
        names
            .stream()
            .collect(
                Collectors
                    .partitioningBy(
                        name -> name.startsWith("T"),
                        Collectors.counting()
                    )
            )
    );
  }

  private static void question3(){
//   Flatten all words
//  Count how many distinct words are there
    List<String> lines = Arrays.asList(
        "apple banana mango",
        "banana orange apple",
        "kiwi mango banana"
    );

    System.out.println(
        lines
            .stream()
            .flatMap(line -> Arrays.stream(line.split(" ")))
            .distinct()
            .count()
    );

  }

  public static void main(String[] args) {
//    question1();
//    question2();
    question3();

  }

}
