package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
  private static String longestNiceSubstring(String s) {
    if (s.length() < 2) return "";

    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) {
      set.add(c);
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c))) {
        continue;
      }

      String left = longestNiceSubstring(s.substring(0, i));
      String right = longestNiceSubstring(s.substring(i + 1));

      return left.length() >= right.length() ? left : right;
    }

    return s;
  }


  public static void main(String[] args) {
    String ans = longestNiceSubstring("YazaAay");
    System.out.println(ans);

  }

}
