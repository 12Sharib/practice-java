package Streams.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class July3 {

  private static void question1() {
//  Create a list of distinct words
//  Sort them alphabetically
//  Make the final list unmodifiable
    List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");

    words
        .stream()
        .distinct()
        .sorted()
        .collect(
            Collectors.collectingAndThen(
                Collectors.toList(),
                Collections::unmodifiableList
            )
        );


  }

  public static void main(String[] args) {
    question1();

  }

}
