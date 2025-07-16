package Blind75;

public class Pallindrome {

  private static void impl(int n) {
    if (n == 0) {
      System.out.println(false);
    }
    int rev = 0;
    int value = n;

    while (n != 0) {
      rev = rev * 10 + n % 10;
      n = n / 10;
    }
    System.out.println(rev);

  }

  public static void main(String[] args) {
    impl(-121);

  }

}
