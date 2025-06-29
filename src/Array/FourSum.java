package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

  private static void impl(int[] nums, int target) {
    Arrays.sort(nums);

    List<List<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int start = j+1;
        int end = nums.length-1;

        while (start < end){
          List<Integer> list = new ArrayList<>();
          int sum = nums[i] + nums[j] + nums[start] + nums[end];
          if (sum == target){
            list.add(nums[i]);
            list.add(nums[j]);
            list.add(nums[start]);
            list.add(nums[end]);

            if (!lists.contains(list)){
              lists.add(list);

            }
            break;
          } else if (sum < target) {
            start++;
          }else {
            end--;
          }
        }
      }
    }
    System.out.println(lists);

  }

  public static void main(String[] args) {
    impl(new int[]{1,0,-1,0,-2,2}, 0);
  }

}
