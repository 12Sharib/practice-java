package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  private static void impl(String[] str) {

    Map<String, List<String>> map = new HashMap<>();

    for(int i=0;i< str.length;i++){
      char [] sorted = str[i].toCharArray();
      Arrays.sort(sorted);
      String s = new String(sorted);
      List<String> list;
      if (map.containsKey(s)){
        list = map.get(s);
        list.add(str[i]);
        map.put(s, list);
      }else {
        list = new ArrayList<>();
        list.add(str[i]);
        map.put(s, list);
      }
    }
    List<List<String>> list = new ArrayList<>();

    list.addAll(map.values());

    System.out.println(list);

  }

  public static void main(String[] args) {
    impl(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

  }

}
