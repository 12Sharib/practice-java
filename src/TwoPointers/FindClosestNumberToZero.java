package TwoPointers;

public class FindClosestNumberToZero {

  private static void impl(int[] nums) {

    int min = 0;
    int last = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (Math.abs(nums[i] - 0) < last) {
        last = Math.abs(nums[i] - 0);
        min = nums[i];
      } else if (Math.abs(nums[i] - 0) == last) {

        min = Math.max(min, last);
      }

    }
    System.out.println(min);

  }

  public static void main(String[] args) {
    impl(new int[]{-4,-2,1,4,8});
  }

}
