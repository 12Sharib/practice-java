package Streams.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class May23 {

  private static void question1() {
//    You are given a list of strings. Write a Java Stream operation to return a list of strings that:
//    Are not empty
//    Have more than 3 characters
//    Are converted to uppercase
//    Sorted in reverse (descending) order

    List<String> words = Arrays.asList("apple", "", "car", "banana", "hi", "dog", "elephant");

    System.out.println(
        words.stream()
            .filter(x -> x.length() > 3)
            .map(String::toUpperCase)
            .sorted(Collections.reverseOrder())
            .toList());

  }

  private static void question2() {
//    You are given a list of integers. Return the square of all even numbers, distinct, and sorted in ascending order.

    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2, 6, 4);

    System.out.println(
        numbers.stream()
            .filter(x -> x % 2 == 0)
            .distinct() // Do after filter
            .map(x -> x * x)
            .sorted()  // Possibility or return invalid order so use sorted
            .toList());
  }

  private static void question3() {
//    You are given a list of strings. Group them by their length, and return a Map<Integer, List<String>>.
    List<String> words = Arrays.asList("cat", "apple", "dog", "banana", "egg", "fish");

    System.out.println(words.stream()
        .collect(
            Collectors
            .groupingBy(String::length, Collectors.joining(", ")))); // Joining use when we need to convert a list into single streams

    System.out.println(words.stream()
        .collect(
            Collectors
                .groupingBy(String::length)));
  }

  private static void question4(){
//    You are given a list of integers. Return the first even number greater than 10. If none exists, return -1.

    List<Integer> numbers = Arrays.asList(3, 9, 11, 15, 12, 20);

    System.out.println(
        numbers.stream()
            .filter(x->x%2==0 && x>10)
            .findFirst()
            .orElse(-1)
    );
  }

  public static void main(String[] args) {
//    question1();
//    question2();
//    question3();
    question4();
  }

}
