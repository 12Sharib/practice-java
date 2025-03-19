package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicates {

  private static void impl(String string){
    System.out.println("Ques: " + string);

    int max = 0;
    int l = 0;
    int r = 0;

    Map<Character, Integer>  map = new HashMap<>();

    while (r<string.length()){
      if (map.containsKey(string.charAt(r))){
        l = map.get(string.charAt(r)) + 1;
      }else {
        map.put(string.charAt(r), r);

        max = Math.max(max, r-l+1);
      }
      r++;

    }


    System.out.println(max);
  }

  public static void main(String[] args) {
impl("tmmzuxt");
  }

}
