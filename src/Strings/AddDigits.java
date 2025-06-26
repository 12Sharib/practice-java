package Strings;

public class AddDigits {

  private static void impl(int num) {


    while(num>=10) {
      int ans = 0;
      while (num > 0) {
        ans = ans + num % 10;
        num = num / 10;
      }
      num = ans;
    }

    System.out.println(num);
  }

  public static void main(String[] args) {
    impl(38);
  }

}
