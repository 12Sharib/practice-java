package Array;

public class ValidPerfectSquare {

  private static void impl(int num) {

    for (int i = 0; i * i <= num; i++) {
      if (i * i == num) {
        System.out.println(i);
        break;
      }
    }
  }

  public static void main(String[] args) {
    impl(1);
  }

}
