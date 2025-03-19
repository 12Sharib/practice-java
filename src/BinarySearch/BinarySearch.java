package BinarySearch;

import java.util.Arrays;

public class BinarySearch {

  private static void impl(int [] arr){
    System.out.println("Ques: " + Arrays.toString(arr));

    int target = 5;

    int low = 0;
    int high = arr.length-1;

    while (low<=high){
      int mid = (low + high) / 2;
      if (target == arr[mid]){
        System.out.println(mid);
        break;
      } else if (target > arr[mid]) {
        low = mid+1;
      }else {
        high = mid-1;
      }
    }


  }

  public static void main(String[] args) {
    impl(new int[]{2,5});
  }

}
