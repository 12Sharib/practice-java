package Streams.problems;

import java.util.List;
import java.util.Optional;

public class AverageOfaList {

  private static void impl(List<Integer> list) {
    Optional<Integer> sum = list.stream().reduce(Integer::sum);
    long count = list.stream().count();

    System.out.println(sum.get() / count);

    System.out.println(list.stream().mapToInt(Integer::intValue).average());
  }

  public static void main(String[] args) {
    impl(List.of(2, 3, 4, 5));
  }

}
