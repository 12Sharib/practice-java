package Streams.problems;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Jul13 {

  private static void question1() {
// Using Stream API, return a Map<String, Long>
// where the key is the domain (e.g., gmail.com) and value is how many times it occurs.
    List<String> emails = List.of(
        "alice@gmail.com", "bob@yahoo.com", "charlie@gmail.com",
        "david@hotmail.com", "eve@yahoo.com", "frank@gmail.com"
    );

    System.out.println(
        emails
            .stream()
            .collect(
                Collectors.groupingBy(
                    x -> x.split("@")[1],
                    Collectors.counting()
                )
            )
    );

  }

  public static void main(String[] args) {
    question1();

  }

}
