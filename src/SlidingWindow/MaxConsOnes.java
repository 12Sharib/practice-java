package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxConsOnes {
  private static void impl(int [] arr){
    System.out.println("Ques: "  + Arrays.toString(arr));

    int l = 0;
    int r=0;
    int max = 0;
//1,1,1,0,0,0,1,1,1,1,0
    while (r< arr.length){

      if (arr[l] !=1){
        l++;
      }
      if (arr[r] == 1){
        max = Math.max(max, r-l+1);
      }else {
        l=r;
      }
      r++;
    }
    System.out.println(max);
  }

  public static void main(String[] args) {
impl(new int[]{1,1,1,0,0,0,1,1,1,1,0});
  }

}
