package Strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  private static void impl(Integer n) {

    List<String> ans = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        ans.add("FizzBuzz");
      } else if (i % 3 == 0) {
        ans.add("Fizz");
      } else if (i % 5 == 0) {
        ans.add("Buzz");
      } else {
        ans.add(String.valueOf(i));
      }
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    impl(4);

  }

}
