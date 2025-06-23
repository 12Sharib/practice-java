package TwoPointers;

public class SumOfSquareNumbers {

  private static void impl(int c) {


    int a = 0;
    int b = c;

    while (a< b){
      int sum = a * a + b*b;
      if (sum == c){
        return;
      } else if (sum > c) {
        b--;
      }else {
        a++;
      }
    }

  }

  public static void main(String[] args) {
  impl(5);
  }

}
