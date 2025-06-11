package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicates {

  private static void impl(String s){
    System.out.println("Ques: " + s);

    Map<Character, Integer> map = new HashMap<>();

    int l = 0;
    int r = 0;
    int max = 0;

    while (r < s.length()) {
      if (map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>=l ) {

        l = map.get(s.charAt(r)) + 1;
        map.put(s.charAt(r), r);

      } else {
        map.put(s.charAt(r), r);
        max = Math.max(max, r - l + 1);
      }
      r++;
    }


    System.out.println(max);
  }

  public static void main(String[] args) {
impl("abcabcbb");
  }

}
