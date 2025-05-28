package Array;

import java.util.Arrays;

public class MaxSubarray {

  private static void impl(int[] arr) {
    System.out.println(Arrays.toString(arr));

    int i = 0;
    int j = 0;

    int max = Integer.MIN_VALUE;

    while (i < arr.length) {
      if (j > arr.length) {
        i++;
        j = i+1;
      } else {
        int sum = 0;

        for (int k = i; k < j; k++) {
          sum += arr[k];
        }

        max = Math.max(sum, max);
        j++;
      }
    }
    System.out.println(max);


    int currsum =0;
    int maxsum = Integer.MIN_VALUE;

    for (int value=0;value<arr.length;value++){
      currsum += arr[value];
      maxsum = Math.max(currsum, maxsum);


      if (currsum<0){
        currsum = 0;
      }
    }
    System.out.println(maxsum);
  }

  public static void main(String[] args) {
    impl(new int[]{-2});
  }

}
