package Blind75;

import java.util.Arrays;

public class CountingBits {

  private static void impl(int n) {
    int[] ans = new int[n + 1];
    int j = 0;

    for (int i = 0; i <= n; i++) {
      int res = 0;
      int k = i;

      while (k != 0) {
        res += k % 2;
        k = k / 2;
      }
      ans[j] = res;
      j++;
    }
    System.out.println(Arrays.toString(ans));
  }

  public static void main(String[] args) {
    impl(2);


  }

}
