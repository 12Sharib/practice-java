package Streams.problems;

import java.util.List;

public class ConvertListIntoLowerOrUpper {
  private static void impl(List<String> list){

    System.out.println(list.stream().map(String::toUpperCase).toList());

  }

  public static void main(String[] args) {
    impl(List.of("Sharib", "Saifi"));

  }

}
