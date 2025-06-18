package TwoPointers;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {

  private static void impl(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    int[] ans = new int[2];

    while (start < end) {
      int sum = arr[start] + arr[end];

      if (sum == target) {
        ans[0] = start + 1;
        ans[1] = end + 1;
        break;
      } else if (sum > target) {
        end--;
      } else {
        start++;
      }
    }
    System.out.println(Arrays.toString(ans));

  }

  public static void main(String[] args) {
    impl(new int[]{2,3,4}, 6);

  }

}
