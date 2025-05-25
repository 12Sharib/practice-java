package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class May26 {

  private static void question1() {
//    You have a list of integers. Remove the duplicates, square each number, then
//    return the top 3 highest squares as a list in descending order.

    List<Integer> numbers = Arrays.asList(2, 3, 2, 4, 5, 3);

    System.out.println(
        numbers.stream().distinct().map(x -> x * x).sorted(Comparator.reverseOrder()).limit(3)
            .toList());


  }
  private static void question2(){
//    You’re given a list of strings.
//    For each string, count how many unique characters it has,
//    and return a Map<String, Integer> of the string to its unique character count.


    List<String> words = Arrays.asList("apple", "banana", "racecar");

    System.out.println(words
        .stream()
        .collect(
            Collectors
                .toMap(word -> word, word -> word.chars()
                    .distinct()
                    .count())));
  }

  public static void main(String[] args) {
//    question1();

    question2();
  }

}
