package Blind75;

public class NumberOf1Bits {

  private static void impl(int a) {
    while (a != 0) {
      System.out.println(a >> 1);
      a = a >> 1;
    }
  }

  public static void main(String[] args) {
    impl(11);

  }

}
