package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
  private static void impl(String ransomNote, String magazine){
    Map<Character, Integer> map = new HashMap<>();

    for (int i=0;i<ransomNote.length();i++){
      if (map.containsKey(ransomNote.charAt(i))){
        map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) + 1);
      }else {
        map.put(ransomNote.charAt(i), 1);
      }
    }

    for (int i=0;i<magazine.length();i++){
      if (map.containsKey(magazine.charAt(i))){
        map.put(magazine.charAt(i), map.get(magazine.charAt(i)) - 1);
      }
    }

    for (int count : map.values()) {
      if (count > 0) {
        System.out.println(false);
      }
    }
    System.out.println(map);

  }

  public static void main(String[] args) {
    impl("fihjjjjei", "hjibagacbhadfaefdjaeaebgi");

  }

}
