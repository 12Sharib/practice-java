package TwoPointers;

public class ValidPalindrome {

  private static void impl(String string) {

    StringBuilder stringBuilder = new StringBuilder();

    String s = string.toLowerCase();
    for (int i = 0; i < string.length(); i++) {
      if (Character.isLetter(string.charAt(i)) || Character.isDigit(string.charAt(i))) {
        stringBuilder.append(s.charAt(i));
      }
    }
    int left = 0;
    int right = stringBuilder.length()-1;


    while (left < right){
      if (stringBuilder.charAt(left) != stringBuilder.charAt(right)){
        System.out.println("Not palindrome");
        break;
      }
      left++;
      right--;
    }
    System.out.println("Palindrome");



  }

  public static void main(String[] args) {
    impl("A man, a plan, a canal: Panama");
  }
}
