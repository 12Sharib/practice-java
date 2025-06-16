package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class June16 {

  private static void question1() {
    List<String> emails = Arrays.asList(
        "test@gmail.com",
        "admin@yahoo.com",
        "hello@gmail.com",
        "info@hotmail.com",
        "user@yahoo.com"
    );

    System.out.println(
        emails
            .stream()
            .map(email -> email.split("@")[1])
            .collect(
                Collectors.groupingBy(
                    email -> email,
                    Collectors.counting()
                )
            )
    );
  }

  private static void question2() {
//    Group the words by their first character (i.e., 'a', 'b', etc.)
//    Return a Map<Character, List<String>>

    List<String> words = Arrays.asList("apple", "banana", "avocado", "apricot", "blueberry",
        "blackberry");

    System.out.println(words
        .stream()
        .collect(
            Collectors.groupingBy(
                word -> word.charAt(0)
            )
        ));

  }

  private static void question3() {
//   Filter names that start with 'T'
//  Convert them to lowercase
//  Sort alphabetically
//  Collect into a List<String>
    List<String> names = Arrays.asList("Tom", "Jerry", "Tim", "John", "Tina", "Bob");

    System.out.println(
        names
            .stream()
            .filter(
                name -> name.startsWith("T")
            )
            .map(String::toLowerCase)
            .sorted()
            .toList()
    );

  }

  private static void question4() {
//  Group items by their category (the part after the colon :)
//  Collect a Map<String, List<String>> where:
//  Key = category (like fruit, vegetable)
//  Value = list of item names (like apple, banana)

    List<String> data = Arrays.asList(
        "apple:fruit",
        "carrot:vegetable",
        "banana:fruit",
        "broccoli:vegetable",
        "grapes:fruit"
    );

    System.out.println(
        data
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        ele -> ele.split(":")[1],
                        Collectors.mapping(ele -> ele.split(":")[0], Collectors.toList())
                    )
            )
    );

  }

  public static void main(String[] args) {
//    question2();
//    question3();
    question4();

  }
}
