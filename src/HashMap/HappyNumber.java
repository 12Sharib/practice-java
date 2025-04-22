package HashMap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

  private static void impl(int number) {

    Set<Integer> set = new HashSet<>();

    while (number != 1 && !set.contains(number)) {
      set.add(number);
      int ans = 0;
      while (number > 0) {
        int digit = number % 10;
        ans += digit * digit;
        number = number / 10;
      }
      number = ans;
    }

    System.out.println(number == 1);
  }

  public static void main(String[] args) {
    impl(19);
  }

}
