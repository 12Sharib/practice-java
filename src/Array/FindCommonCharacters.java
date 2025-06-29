package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {

  private static void impl(String[] words) {

    Map<Character, Integer> map = new HashMap<>();
    String word = words[0];

    for (int i = 0; i < word.length(); i++) {
      if (!map.containsKey(word.charAt(i))) {
        map.put(word.charAt(i), 1);
      } else {
        map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
      }
    }
    for (int i = 1; i < words.length; i++) {
      Map<Character, Integer> temp = new HashMap<>();

      for (int j = 0; j < words[i].length(); j++) {
        if (map.containsKey(words[i].charAt(j))) {
          temp.put(words[i].charAt(j), temp.getOrDefault(words[i].charAt(j), 0) + 1);
        }
      }

      temp.forEach((key, value) ->
          temp.put(key, Math.min(map.get(key), temp.get(key)))
      );
      map.clear();

      temp.forEach(map::put);
    }

    List<String> strings = new ArrayList<>();
    map.forEach((key, value) -> {
      for (int i = 0; i < value; i++) {
        strings.add("" + key);

      }
    });

    System.out.println(strings);


  }

  public static void main(String[] args) {
    impl(new String[]{"cool", "lock", "cook"});

  }

}
