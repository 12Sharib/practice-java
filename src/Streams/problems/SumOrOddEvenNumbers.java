package Streams.problems;

import java.util.List;

public class SumOrOddEvenNumbers {
  private static void impl(List<Integer> list){
    System.out.println(list.stream().filter(x->x%2!=0).reduce(Integer::sum));

  }

  public static void main(String[] args) {
    impl(List.of(1,2,3,5));

  }

}
