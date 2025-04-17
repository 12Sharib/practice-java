package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
  private static void impl(String s, String t){
    Map<Character, Character> map = new HashMap<>();

    if (s.length() != t.length()){
      System.out.println(false);
    }

    for (int i=0;i<s.length();i++){
      if (map.containsKey(s.charAt(i))){
        if (!map.get(s.charAt(i)).equals(t.charAt(i))){
          System.out.println(false);
          break;
        }
      }else {
        if (map.containsValue(t.charAt(i))){
          System.out.println(false);
          break;
        }else{
          map.put(s.charAt(i), t.charAt(i));
        }

      }
    }
    System.out.println(true);
  }

  public static void main(String[] args) {
    impl("badc","baba");

  }

}
