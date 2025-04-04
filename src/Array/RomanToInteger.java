package Array;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  private static void impl(String string) {
    System.out.println(string);
    Map<String, Integer> map = Map.ofEntries(
        Map.entry("I", 1),
        Map.entry("IV", 4),
        Map.entry("V", 5),
        Map.entry("IX", 9),
        Map.entry("X", 10),
        Map.entry("XL", 40),
        Map.entry("L", 50),
        Map.entry("XC", 90),
        Map.entry("C", 100),
        Map.entry("CD", 400),
        Map.entry("D", 500),
        Map.entry("CM", 900),
        Map.entry("M", 1000)
    );

    int sum = 0;
    for (int i = 0; i < string.length();) {
      if (i + 1 < string.length() && map.containsKey(string.substring(i, i + 2))) {
        sum += map.get(string.substring(i, i + 2));
        i+=2;
      }else{
        sum += map.get(string.substring(i, i + 1));
        i+=1;
      }

    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    impl("MCMXCIV");
//    1000 + 100 + 1000 + 10 + 100
  }

}
