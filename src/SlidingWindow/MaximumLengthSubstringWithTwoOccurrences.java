package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumLengthSubstringWithTwoOccurrences {

  private static void impl(String s) {

    int max = 0;
    Map<Character, Integer> map = new HashMap<>();
    int count = 0;

    int left = 0;
    int right = 0;

    while (right < s.length()) {

      map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0 )+ 1);

      while (map.get(s.charAt(right)) > 2) {
        map.put(s.charAt(left), map.get(s.charAt(left)) - 1);

        if (map.get(s.charAt(left))== 0){
          map.remove(s.charAt(left));
        }
        left++;

      }
      max = Math.max(max, right - left + 1);
      right++;
    }

    System.out.println(max);

  }

  public static void main(String[] args) {
    impl("bcbbbcba");
  }

}
