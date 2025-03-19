package Array;

public class ReverseInteger {

  private static void impl(int x){
    System.out.println("Ques: " + x);

    int rev = 0;
    while (x!=0){

      int digit = x % 10;

      // Check for overflow before updating rev
      if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
        return;
      }
      if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
        return;
      }
      rev = rev * 10 + digit;
      x = x/10;


    }
    System.out.println(rev);
  }

  public static void main(String[] args) {
    impl(3749);
  }

}
