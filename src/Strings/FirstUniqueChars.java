package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChars {

  private static void impl(String s) {

    Map<Character, Integer> map = new LinkedHashMap<>();

    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }
    System.out.println(map);

    for (int i = 0; i < s.length(); i++) {
      if (map.get(s.charAt(i)) == 1){
        System.out.println(s.charAt(i));
        break;
      }
    }

  }

  public static void main(String[] args) {
    impl("leetcode");
  }

}
