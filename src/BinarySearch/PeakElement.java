package BinarySearch;

import java.util.Arrays;

public class PeakElement {
  private static void impl(int arr[]){
    System.out.println(Arrays.toString(arr));

    int peak = Integer.MIN_VALUE;
    int index = 0;


    for (int i=0;i<arr.length;i++){
      if (peak < arr[i]){
        peak = i;
      }
    }
    System.out.println(index);
  }

  public static void main(String[] args) {
    impl(new int[]{1,2,1,3,5,6,4});
  }

}
