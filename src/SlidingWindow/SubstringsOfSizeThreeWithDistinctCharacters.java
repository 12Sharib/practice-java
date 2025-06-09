package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class SubstringsOfSizeThreeWithDistinctCharacters {

  private static void impl(String s) {
    int count = 0;

    for (int i = 0; i <= s.length() - 3; i++) {
      Set<Character> list = new HashSet<>();
      list.add(s.charAt(i));
      list.add(s.charAt(i + 1));
      list.add(s.charAt(i + 2));
      if (list.size() == 3) {
        count++;
      }
    }

    System.out.println(count);
  }

  public static void main(String[] args) {
    impl("aababcabc");

  }

}
