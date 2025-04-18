package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  private static void impl(String s, String t) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i=0;i<s.length();i++){
      if (map.containsKey(s.charAt(i))){
        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
      }else{
        map.put(s.charAt(i),1);
      }
    }

    for (int i=0;i<t.length();i++){
      if (map.containsKey(t.charAt(i))){
        map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
      }else{
        System.out.println(false);
      }
    }
    for (int count: map.values()){
      if (count > 0){
        System.out.println(false);
      }
    }
    System.out.println(map);
  }

  public static void main(String[] args) {
    impl("aacc", "ccac");

  }

}
