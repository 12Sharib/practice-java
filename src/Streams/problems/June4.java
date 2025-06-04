package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class June4 {

  private static void question1() {
//    You have a list of integers. Your task is to:
//    Square each number
//    Group them by number of digits in the square
//    Collect the result into a map
    List<Integer> numbers = Arrays.asList(2, 3, 10, 15, 7);

    System.out.println(numbers
        .stream()
        .map(x -> x * x)
        .collect(
            Collectors.groupingBy(x -> x.toString().length())
        ));
  }

  private static void question2() {
//    You have a list of strings. Your task is to:
//    Flatten all characters from all words into a single stream
//    Filter out only the vowels
//    Group them and count the frequency of each vowel
//    Sort the result in descending order of frequency

    List<Character> characters = List.of('a', 'i', 'o', 'e', 'u');

    List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "kiwi");

    System.out.println(
        words
            .stream()
            .collect(Collectors.joining())
            .chars()
            .mapToObj(c -> (char) c)
            .filter(characters::contains)
            .collect(
                Collectors.groupingBy(x -> x, Collectors.counting())
            )
    );

  }

  private static void question3() {
//    You have a list of sentences. Your task is to:
//    Split each sentence into words
//    Flatten all the words into one stream
//    Count the frequency of each word (case-insensitive)
//    Return the result as a Map<String, Long>

    List<String> sentences = Arrays.asList(
        "Java is great",
        "Streams are great",
        "I love Java"
    );

    System.out.println(
        sentences
            .stream()
            .flatMap(x -> Arrays.stream(x.split(" ")))
            .map(String::toLowerCase)
            .collect(
                Collectors.groupingBy(x -> x, Collectors.counting())
            )

    );
  }

  public static void main(String[] args) {
//    question1();
//    question2();
    question3();
  }

}
