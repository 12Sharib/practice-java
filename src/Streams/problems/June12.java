package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class June12 {

  private static void question1() {

//    Print the count of distinct vowels present across all the words.

    List<Character> characters = Arrays.asList('a', 'e', 'i', 'o', 'u');
    List<String> words = Arrays.asList("apple", "banana", "grape", "kiwi", "orange");

    System.out.println(
        words
            .stream()
            .collect(Collectors.joining())
            .chars()
            .mapToObj(x -> (char) x)
            .filter(characters::contains)
            .distinct()
            .toList()
    );

  }

  public static void main(String[] args) {
    question1();
  }

}
