package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class June5 {

  private static void question1() {
//    You’re given a list of String words.
//    Count the number of vowels in all the words combined.
//    Vowels are: 'a', 'e', 'i', 'o', 'u' (case-insensitive)
//    Return the total count of vowels.

    List<String> words = Arrays.asList("Apple", "banana", "Grape", "kiwi");
    List<Character> characters = List.of('a', 'i', 'o', 'e', 'u');
    System.out.println(
        words
            .stream()
            .collect(Collectors.joining())
            .toLowerCase()
            .chars()
            .mapToObj(c -> (char) c)
            .filter(characters::contains)
            .count()
    );
  }

  private static void question2() {
    List<String> words = Arrays.asList("apple", "ant", "bat", "ball", "cat", "cup", "cow");

    System.out.println(
        words
            .stream()
            .collect(Collectors.groupingBy(
                String::length, Collectors.groupingBy(x -> x.charAt(0))
            ))
    );
  }

  private static void question3() {
//    Group and Sort by Word Length
    List<String> words = Arrays.asList("apple", "bat", "banana", "ant", "cat", "dog");

    System.out.println(words
        .stream()
        .collect(Collectors.groupingBy(
            String::length, Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                  list.sort(Comparator.naturalOrder());
                  return list;
                }
            )
        )));
  }

  private static void question4() {
//    Find the Longest Word Length
    List<String> words = Arrays.asList("apple", "banana", "cat", "elephant");

    System.out.println(words
        .stream()
        .map(String::length)
        .reduce(Integer::max)
    );
  }

  public static void main(String[] args) {
//    question1();
//    question2();
//    question3();
    question4();
  }

}
