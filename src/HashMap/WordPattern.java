package HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

  private static void impl(String pattern, String s) {
    Map<Character, String> map = new HashMap<>();

    String [] arr = s.split(" ");


    for (int i=0;i<pattern.length();i++){
      if (map.containsKey(pattern.charAt(i))){
        if (!map.get(pattern.charAt(i)).equals(arr[i])){
          System.out.println(false);
          break;
        }
      }else{
        if (map.containsValue(arr[i])){
          System.out.println(false);
        }else{
          map.put(pattern.charAt(i), arr[i]);
        }
      }

    }
    System.out.println(map);

  }

  public static void main(String[] args) {
    impl("abba", "dog cat cat fish");
  }

}
