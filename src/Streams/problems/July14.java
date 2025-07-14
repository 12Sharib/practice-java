package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class July14 {

  private static void question1() {
    List<String> lines = List.of(
        "java spring boot",
        "java streams lambda",
        "spring cloud java"
    );

    System.out.println(
        lines
            .stream()
            .flatMap(line -> Arrays.stream(line.split(" ")))
            .collect(
                Collectors
                    .groupingBy(
                        Function.identity(),
                        Collectors.counting()
                    )
            )
    );

  }

  public static void main(String[] args) {
    question1();

  }

}
