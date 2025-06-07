package Math;

public class Pallindrome {

  private static void impl(int x) {
    if (x == 0 || x < 0) {
      return;
    }

    int rev = 0;

    while (x > 0) {
      rev = rev * 10 + x % 10;
      x = x / 10;
    }
    System.out.println(rev);
  }

  public static void main(String[] args) {
    impl(121);
  }

}
