package Strings;

public class AddStrings {

  private static void impl(String num1, String num2) {

    int sum = 0;
    int carry = 0;

    int i = num1.length()-1;
    int j = num2.length()-1;

    StringBuilder stringBuilder = new StringBuilder();

    while (i >= 0 && j >= 0) {
      int ans = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + carry;

      carry = ans / 10;
      ans = ans % 10;
      stringBuilder.append(ans);

      i--;
      j--;
    }
    while (i >= 0) {
      int ans = (num1.charAt(i) - '0') + carry;

      carry = ans / 10;
      ans = ans % 10;
      stringBuilder.append(ans);
      i--;
    }
    while (j >= 0) {
      int ans = (num2.charAt(j) - '0') + carry;

      carry = ans / 10;
      ans = ans % 10;
      stringBuilder.append(ans);
      j--;
    }
    if (carry == 1) {
      stringBuilder.append(carry);
    }

    System.out.println(stringBuilder.reverse());

  }

  public static void main(String[] args) {
    impl("19", "123");

  }

}
