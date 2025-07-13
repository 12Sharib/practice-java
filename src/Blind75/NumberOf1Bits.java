package Blind75;

public class NumberOf1Bits {

  private static void impl(int a) {
    int res = 0;
    while (a != 0) {
      res += a % 2;
      a = a / 2;
    }
    System.out.println(res);
  }

  public static void main(String[] args) {
    impl(11);

  }

}
