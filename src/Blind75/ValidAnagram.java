package Blind75;

import java.util.Arrays;

public class ValidAnagram {

  private static void impl(String s, String t) {
//    char[] arr1 = s.toCharArray();
//
//    Arrays.sort(arr1);
//    String s1 = Arrays.toString(arr1);
//
//    char[] arr2 = t.toCharArray();
//    Arrays.sort(arr2);
//    String s2 = Arrays.toString(arr2);
//
//    if (!s1.equals(s2)) {
//      System.out.println("false");
//    }

    int[] arr = new int[26];

    for (int i = 0; i < s.length(); i++) {
      arr[s.charAt(i) - 'a']++;
      arr[t.charAt(i) - 'a']--;
    }

    for (int i = 0; i < 26; i++) {
      if (arr[i] != 0) {
        break;
      }
    }

    System.out.println(Arrays.toString(arr));
  }


  public static void main(String[] args) {
    impl("aacc", "ccac");

  }

}
