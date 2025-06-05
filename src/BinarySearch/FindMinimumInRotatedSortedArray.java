package BinarySearch;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {
  private static void impl(int [] arr){
    System.out.println(Arrays.toString(arr));

    int start = 0;
    int end = arr.length-1;

    int min = Integer.MAX_VALUE;

    while(start<=end){
      int mid = (start + end)/2;
      if (arr[start] <= arr[mid]){
        min = Math.min(min, arr[start]);
        start = mid+1;
      }else{
        min = Math.min(min, arr[mid]);
        end = mid-1;
      }
    }
    System.out.println(min);
  }

  public static void main(String[] args) {
    impl(new int[]{3,4,5,1,2});

  }

}
