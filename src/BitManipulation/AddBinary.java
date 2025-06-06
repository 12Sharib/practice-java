package BitManipulation;

public class AddBinary {

  public static void addBinary(String a, String b) {
    int carry = 0;

    int i = a.length() - 1;
    int j = b.length() - 1;

    StringBuilder builder = new StringBuilder();
    while (i >= 0 && j >= 0) {
      int first = a.charAt(i) - '0';
      int second = b.charAt(j) - '0';

      int sum = first + second + carry;

      int val = sum % 2;
      carry = sum / 2;

      builder.append((char) (val + 48));

      i--;
      j--;
    }
    while (i >= 0) {
      int first = a.charAt(i) - '0';
      int sum = first + carry;

      int val = sum % 2;
      carry = sum / 2;

      builder.append((char) (val + 48));

      i--;
    }
    while (j>=0){
      int first = b.charAt(j) - '0';
      int sum = first  + carry;

      int val = sum%2;
      carry = sum/2;

      builder.append((char) (val + 48));

      i--;

    }
    if (carry != 0) {
      builder.append("1");
    }
    System.out.println(builder.reverse());

  }

  public static void main(String[] args) {
    addBinary("11","1");

  }

}
