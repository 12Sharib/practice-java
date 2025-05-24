package Streams.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class May25 {

  private static void question1() {
//    You’re given a list of strings. Return a list of unique characters (as strings) that appear across all words, in alphabetical order.

    List<String> words = Arrays.asList("apple", "banana");
    System.out.println(words
        .stream()
        .collect(Collectors.joining())
        .chars()
        .distinct()
        .sorted()
        .mapToObj(x -> (char) x)
        .toList());

  }

  private static void question2() {
//  Given a list of integers, group them by their remainder when divided by 3.
//  Return a Map<Integer, List<Integer>>, where the key is the remainder (0, 1, or 2).

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    System.out.println(numbers
        .stream()
        .collect(
            Collectors.groupingBy(x -> x % 3))); // Key the remainder and if the key has same remainder that add in the list

  }

  private static void question3(){
//    You’re given a list of strings.
//    Find the string with the highest number of vowels (a, e, i, o, u — case-insensitive).
//    If there's a tie, return any one of them.

    List<String> words = Arrays.asList("apple", "banana", "grape", "kiwi", "orange");

    System.out.println(words.stream()
        .max(Comparator.comparing(May25::countVowels)));

  }
  private static long countVowels(String s){
    return s.toLowerCase()
        .chars()
        .filter(c -> "aeiou".indexOf(c) != -1)
        .count();
  }

  private static void question4(){
//    Given a list of strings,
//    return a map of each character to the number of times it appears across all strings (case-insensitive).

    List<String> words = Arrays.asList("apple", "banana");

    System.out.println(words.stream()
        .collect(Collectors.joining())
        .chars()
            .mapToObj(c ->(char)c)
        .collect(Collectors.groupingBy(c->c, Collectors.counting())));
  }

  public static void main(String[] args) {
//    question1();
//    question2();

//    question3();
    question4();
  }


}
