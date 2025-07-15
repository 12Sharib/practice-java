package Blind75;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

  private static void impl(String s) {
    Map<Character, Integer> map = new HashMap<>();

    int l = 0;
    int r = 0;
    int max = 0;

    while (r < s.length()) {
      if (map.containsKey(s.charAt(r)) && l <= map.get(s.charAt(r))) {
        l = map.get(s.charAt(r)) + 1;
        map.put(s.charAt(r), r);
      } else {
        max = Math.max(max, r - l + 1);
        map.put(s.charAt(r), r);
      }
      r++;
    }
    System.out.println(max);

  }

  public static void main(String[] args) {
    impl("pwwkew");

  }

}
