package Blind75;

public class LongestPalindromicSubstring {

  private static void impl(String s) {
    int start = 0;
    int end = 0;
    int max = 0;

    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        if (isPallindrome(i, j, s) && max < j - i + 1) {
          start = i;
          end = j;
          max = Math.max(max, j - i + 1);
        }
      }
    }
    System.out.println(s.substring(start, end + 1));
  }

  private static boolean isPallindrome(int i, int j, String s) {
    while (i < j) {
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
