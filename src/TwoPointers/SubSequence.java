package TwoPointers;

public class SubSequence {
  private static void impl(String s, String t){
    StringBuilder stringBuilder = new StringBuilder();

    int left = 0;
    int right = 0;

    while (left < s.length() && right < t.length()){
      if (s.charAt(left) == t.charAt(right)){
        left++;
        right++;
      }else {
        right++;
      }
    }
    if (left == s.length()){
      System.out.println(true);
    }else {
      System.out.println(false);
    }
  }

  public static void main(String[] args) {
    impl("bac", "ahbgdc");

  }

}
