package BinarySearch;

import java.util.Arrays;

public class SearchRange {
  private static void impl(int [] arr, int target){
    int first = -1;
    int start = 0;
    int end = arr.length -1;

    while(start <= end){
      int mid = (start + end)/2;

      if(arr[mid] == target){
        first = mid;
        end = mid-1;
      }else if(arr[mid] > target){
        end = mid-1;
      }else{
        start = mid+1;
      }
    }

    start = 0;
    end = arr.length-1;
    int last = -1;

    while(start <= end){
      int mid = (start +  end)/2;

      if(arr[mid] == target){
        last = mid;
        start = mid+1;
      }else if(arr[mid] > target){
        end = mid-1;
      }else{
        start = mid+1;
      }
    }
    if(first == -1){
      System.out.println(-1);
    }else{
      System.out.println(first + " " + last);
    }



  }

  public static void main(String[] args) {
  impl(new int[]{5,7,7,8,8,10}, 8);
  }

}
