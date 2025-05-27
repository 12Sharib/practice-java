package Streams.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class May28 {

  private static void question1() {
    List<String> words = Arrays.asList("hi", "hello", "world", "banana",
        "supercalifragilisticexpialidocious");

    System.out.println(words
        .stream()
        .max((x, y) -> x.length() - y.length()));

  }

  private static void question2() {
    List<String> words = Arrays.asList("hi", "hello", "apple", "sun", "hi", "go");

    System.out.println(words
        .stream()
        .collect(Collectors.groupingBy(
            String::length, Collectors.counting()
        )));
  }

  private static void question3() {
//    You have a list of strings. Your task is to count the number of vowels in all the words combined.
    List<String> words = Arrays.asList("apple", "banana", "orange");

    List<Character> characters = Arrays.asList('a', 'e', 'i', 'o', 'u');

    System.out.println(words
        .stream()
        .collect(Collectors.joining())
        .chars()
        .mapToObj(x -> (char) x)
        .filter(y -> characters.contains(y))
        .count());

    System.out.println(
        String.join("", words)
            .chars()
            .mapToObj(x -> (char) x)
            .filter(characters::contains)
            .count()
    );
  }

  private static void question4() {
//    You have a list of strings. For each word, calculate how many unique characters it has, and group words by this count.
    List<String> words = Arrays.asList("apple", "banana", "grape", "kiwi", "mango");

    System.out.println(words
        .stream()
        .collect(
            Collectors.groupingBy(
                word -> (int) word.chars().distinct().count()
            )
        ));

  }

  public static void main(String[] args) {
//    question1();
//    question2();
//    question3();
    question4();
  }



}
