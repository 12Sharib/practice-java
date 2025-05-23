package Streams.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class May24 {

  private static void question1() {
// You're given a list of strings. Count how many strings start with the letter 'a' (case-insensitive).

    List<String> words = Arrays.asList("Apple", "banana", "apricot", "Avocado", "berry", "cherry");

    System.out.println(
        words.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).count());

  }

  private static void question2() {
//    You have a list of integers. Create a comma-separated string of odd numbers, sorted in descending order.
    List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 10, 7);

    System.out.println(
        numbers.stream().sorted((a, b) -> b - a).filter(x -> x % 2 != 0).map(String::valueOf)
            .collect(
                Collectors.joining(", ")));
  }

  private static void question3() {
//    Given a list of strings, return the longest string. If there are multiple strings with the same max length, return any one of them.

    List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

    System.out.println(words.stream().sorted((a, b) -> b.length() - a.length()).findFirst());
  }

  private static void question4() {
//    Given a list of integers, partition them into two groups: even and odd.
//    Return a Map<Boolean, List<Integer>> where:
//    true → even numbers
//    false → odd numbers


    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    System.out.println(numbers.stream().collect(Collectors.partitioningBy(x->x%2==0)));
  }

  private static void question5(){
//    Given a list of strings, find the total number of characters across all strings.

    List<String> words = Arrays.asList("apple", "banana", "kiwi");

    System.out.println(words.stream().collect(Collectors.joining()).length());
  }

  public static void main(String[] args) {
//    question1();

//    question2();
//    question3();
//    question4();
    question5();
  }



}
