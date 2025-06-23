package TwoPointers;

import java.util.Arrays;

public class KDiffPairsInAnArray {

  private static void impl(int[] nums, int k) {

    Arrays.sort(nums);

    int start = 0;
    int end = 0;
    int ans = 0;

    while (start < nums.length && end < nums.length) {
      int value = nums[end] - nums[start];
      if (value == k) {
        ans++;
        start++;
        end++;

        while (end < nums.length && nums[end] == nums[end - 1]) {
          end++;
        }
      } else if (value > k) {
        start++;
        if (end - start == 0){
          end++;
        }
      } else {
        end++;
      }
    }

    System.out.println(ans);

  }

  public static void main(String[] args) {
    impl(new int[]{1, 3, 1, 5, 4}, 2);
  }

}
