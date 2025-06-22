package TwoPointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestWordInDictionaryThroughDeleting {

  private static void impl(String s, List<String> dictionary) {
    String result = "";

    for (String dict : dictionary) {
      if (isSubsequenc(s, dict)) {
        if (dict.length() > result.length() || (dict.length() == result.length() && dict.compareTo(result) < 1)) {
          result = dict;
        }
      }
    }
    System.out.println(result);

  }

  private static boolean isSubsequenc(String s, String dict) {

    int i = 0;
    int j = 0;

    if (dict.length() > s.length()) {
      return false;
    }

    while (i < s.length() && j < dict.length()) {
      if (s.charAt(i) == dict.charAt(j)) {
        i++;
        j++;
      } else {
        i++;
      }
    }
    return j == dict.length();
  }

  public static void main(String[] args) {
    impl("abpcplea", Arrays.asList("a", "b", "c"));
  }

}
