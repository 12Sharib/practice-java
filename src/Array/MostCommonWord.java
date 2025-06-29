package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonWord {

  private static void impl(String s, String[] b) {
    String ques = s.toLowerCase();

    Map<String, Long> map =
        Arrays.stream(ques.toLowerCase().split("[^a-zAZ]"))
            .filter(word -> !word.isEmpty())
            .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                )
            );

    System.out.println(map);

    Long min = 0L;
    String ans = new String();
    for (Entry<String, Long> entry : map.entrySet()) {
      String key = entry.getKey();
      Long value = entry.getValue();

      for(int i=0;i<b.length;i++){
        if (!key.equals(b[i]) && min < value) {
          min = value;
          ans = new String(key);
        }
      }

    }
    System.out.println(ans);


  }

  public static void main(String[] args) {
    impl("a.", new String[]{""});

  }

}
