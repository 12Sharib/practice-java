package TwoPointers;

public class LongestPalindromicSubstring {

  private static void impl(String s) {

    int maxlen = 0;
    int start = 0;
    int end = 0;

    for (int i = 0; i < s.length(); i++) {

      for (int j = i; j <s.length(); j++) {
        if (isPallindrome(s, i, j)) {
          if ((j - i + 1) > maxlen) {
            maxlen = j - i + 1;
            start = i;
            end = j;
          }
        }
      }
    }

//    int start = 0;
//    int end = 0;
//
//    StringBuilder ans = new StringBuilder();
//
//    while (start < s.length()) {
//
//      if (end <= s.length()) {
//        StringBuilder builder = new StringBuilder(s.substring(start, end));
//        String rev = builder.reverse().toString();
//
//        builder.reverse();
//        if (rev.equals(s.substring(start, end)) && ans.length() < rev.length()) {
//          ans.setLength(0);
//          ans.append(builder.toString());
//        }
//        end++;
//      } else {
//        start++;
//        end = start + 1;
//      }
//
//    }
    System.out.println(s.substring(start, end+1));

  }

  private static boolean isPallindrome(String s, int i, int j) {

    while (i <= j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    impl("babad");

  }

}
