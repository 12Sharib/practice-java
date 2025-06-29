package Array;

import java.util.Arrays;

public class LongestSubarrayWithSumK {

  private static void impl(int[] arr, int k) {

    int start = 0;
    int max = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum > k) {
        sum -= arr[start];
        start++;
      }
      if (sum == k) {
        max = Math.max(max, i - start + 1);

      }
    }
    System.out.println(max);

    System.out.println(Arrays.toString(arr));

  }

  public static void main(String[] args) {
    impl(new int[]{10, 5, 2, 7, 1, -10}, 15);
  }

}
