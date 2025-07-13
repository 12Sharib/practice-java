package Blind75;

public class SumOfTwoIntegers {

  private static void impl(int a, int b) {
    while (b != 0) {
      int temp = (a & b) << 1;
      a = a ^ b;
      b = temp;
    }
    System.out.println(a);

  }

  public static void main(String[] args) {
    impl(1, 2);

  }

}
