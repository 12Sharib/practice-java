package Blind75;

public class PalindromicSubstrings {

  private static void impl(String s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        if (isPalindrome(i, j, s)) {
          count++;
        }
      }
    }
    System.out.println(count);

  }

  private static boolean isPalindrome(int i, int j, String s) {
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
    impl("abc");

  }

}
