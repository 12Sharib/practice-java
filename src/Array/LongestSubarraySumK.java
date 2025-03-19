package Array;

import java.util.Arrays;

public class LongestSubarraySumK {
  private static void impl(int [] arr){
    System.out.println("Ques: " + Arrays.toString(arr));

    int k=15;

    int max = 0;
    int sum = 0;
    int count = 0;
    for(int i=0;i<arr.length;i++){
      sum = 0;
      for (int j=i;j<arr.length;j++){
        sum += arr[j];
        if (sum == k){
          max = Math.max(max, j-i+1);
        }
      }
    }
    System.out.println(max);
  }

  public static void main(String[] args) {
impl(new int[]{10, 5, 2, 7, 1, -10});
  }

}
