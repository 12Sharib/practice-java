package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class May27 {

  private static void question1() {
//    You have a list of strings.
//    From all the strings,
//    extract all vowels and return a sorted list of distinct vowels used (case-insensitive).

    List<String> words = Arrays.asList("appl", "banana", "Orange", "grape");
    List<Character> characters = Arrays.asList('a', 'e', 'i', 'o', 'u');
    System.out.println(words.stream().collect(Collectors.joining())
        .toLowerCase()
        .chars()
        .mapToObj(x -> (char) x)
        .filter(characters::contains)
        .distinct()
        .sorted()
        .toList());
  }

  private static void question2() {
    List<String> words = Arrays.asList("apple", "banana");

    System.out.println(words
        .stream()
        .collect(Collectors.joining())
        .chars()
        .mapToObj(x -> (char) x)
        .collect(Collectors.groupingBy(x -> x, Collectors.counting())));
  }

  private static void question3() {
// You have a list of integers.
//Group them by "even" or "odd" and within each group, collect them into a sorted list.
    List<Integer> numbers = Arrays.asList(3, 1, 4, 5, 2, 6, 7);

    System.out.println(numbers
        .stream()
        .sorted()
        .collect(Collectors.groupingBy(
            num -> {
              if (num % 2 == 0) {
                return "even";
              } else {
                return "odd";
              }
            }
        )));
  }

  public static void main(String[] args) {
//  question1();
//    question2();
    question3();
  }

}
