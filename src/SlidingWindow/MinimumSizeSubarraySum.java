package SlidingWindow;

public class MinimumSizeSubarraySum {

  private static void impl(int[] arr, int target) {

    int left = 0;
    int right = 0;
    int max = Integer.MAX_VALUE;


    int sum = 0;

    while (right < arr.length && left < arr.length){
      sum+=arr[right];

      while (sum >= target){
        max = Math.min(max, right-left+1);

        sum -= arr[left];
        left++;
      }

      right++;

    }
    System.out.println(max == Integer.MAX_VALUE?0:max);

  }

  public static void main(String[] args) {
    impl(new int[]{1,1,1,1,1,1,1,1}, 11);
  }

}
