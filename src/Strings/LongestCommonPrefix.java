package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

  private static void impl(String[] strs) {

    Arrays.sort(strs);
//    System.out.println(Arrays.toString(strs));
//    String ans = strs[0];
//    for (int i = 1; i < strs.length; i++) {
//
//      int j = 0;
//      int k = 0;
//      String curr = strs[i];
//      StringBuilder builder = new StringBuilder();
//
//      while (j < ans.length() && k < curr.length()) {
//        if (ans.charAt(j) == curr.charAt(k)) {
//          builder.append(ans.charAt(j));
//        } else {
//          break;
//        }
//        j++;
//        k++;
//      }
//
//      ans = builder.toString();
//    }

    int length = strs.length - 1;

    int i = 0;

    StringBuilder builder = new StringBuilder();
    while (i < strs[0].length() && i < strs[length].length()) {
      if (strs[0].charAt(i) == strs[length].charAt(i)) {
        builder.append(strs[0].charAt(i));
      } else {
        break;
      }
      i++;
    }
    System.out.println(builder);


  }

  public static void main(String[] args) {
    impl(new String[]{"flower", "flow", "flight"});

  }

}

/**
 * ans = "flow"
 * <p>
 * currPref = "";
 * <p>
 * flow i
 * <p>
 * flight j
 * <p>
 * currPref = "fl" ans = currPref;
 */
