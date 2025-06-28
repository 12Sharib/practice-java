package TwoPointers;

public class AddTwoBinary {

  private static void impl(String a, String b) {
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    StringBuilder builder = new StringBuilder();

    while (i >= 0 || j >= 0 || carry == 1) {
      int sum = carry;

      if (i >= 0) {
        sum += a.charAt(i) - '0';
        i--;
      }
      if (j >= 0) {
        sum += b.charAt(j) - '0';
        j--;
      }
      builder.append(sum % 2);
      carry = sum / 2;
    }

    System.out.println(builder.reverse());

  }

  public static void main(String[] args) {
    impl("1011", "101");

  }

}
