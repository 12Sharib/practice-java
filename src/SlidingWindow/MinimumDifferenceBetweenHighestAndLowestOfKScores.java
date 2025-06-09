package SlidingWindow;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {

  private static void impl(int[] arr, int k) {
    int min = Integer.MAX_VALUE;

    Arrays.sort(arr);

   int left = 0;
   int right = k-1;

   while (right<arr.length){
     min = Math.min(min, arr[right] - arr[left]);

     left++;
     right++;
   }
    System.out.println(min);

  }

  public static void main(String[] args) {
    impl(new int[]{9, 4, 1, 7}, 3);
  }

}
