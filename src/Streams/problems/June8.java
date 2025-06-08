package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class June8 {

  private static void question1() {

//    print the first longest word (by length) in lowercase.
    List<String> words = Arrays.asList("sky", "apple", "sun", "Banana", "sea");

    System.out.println(words
        .stream().max(Comparator.comparing(String::length))
        .map(String::toLowerCase)
    );
  }

  private static void question2() {
//     Using Stream API, print the sum of all numbers that are divisible by both 2 and 3.
    List<Integer> numbers = Arrays.asList(2, 3, 4, 6, 9, 12, 15, 18);

    System.out.println(numbers
        .stream()
        .filter(x -> x%2 ==0 && x%3==0)
        .reduce(Integer::sum));
  }
  private static void question3(){
//     Print a list of unique characters, sorted alphabetically, from all words combined.

    List<String> words = Arrays.asList("java", "stream", "filter", "map", "collect", "flatmap");

    System.out.println(
        words
            .stream()
            .collect(Collectors.joining())
            .chars()
            .mapToObj(x -> (char) x)
            .distinct()
            .toList()
    );

  }

  public static void main(String[] args) {
//    question1();

//    question2();
    question3();
  }

}
