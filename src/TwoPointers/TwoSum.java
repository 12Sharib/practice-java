package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  private static void impl(int[] nums, int target) {

    int[] ans = new int[2];
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int value = target - nums[i];

      if (map.containsKey(value)) {
        ans[0] = map.get(value);
        ans[1] = i;

        break;
      }
      map.put(nums[i], i);
    }

    System.out.println(Arrays.toString(ans));

  }

  public static void main(String[] args) {
    impl(new int[]{3, 2, 4}, 6);
  }

}
