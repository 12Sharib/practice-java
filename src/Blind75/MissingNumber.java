package Blind75;

public class MissingNumber {

  private static void impl(int[] nums) {
    int ans = 0;

    for (int i = 0; i < nums.length; i++) {
      ans = ans ^ i ^ nums[i];
    }
    System.out.println(ans ^ nums.length);
  }

  public static void main(String[] args) {
    impl(new int[]{3, 0, 1});
  }

}
