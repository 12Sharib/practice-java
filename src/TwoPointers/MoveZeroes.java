package TwoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes {
  private static void impl(int [] arr){

    int start =0;
    int end = 1;

    while (end < arr.length){
      if (arr[start]!=0){
        start++;
        end = start+1;
      }else if (arr[start] == 0 && arr[end]!=0){
        int c = arr[start];
        arr[start] = arr[end];
        arr[end] = c;

        start++;
        end = start+1;
      }else {
        end++;
      }
    }

    System.out.println(Arrays.toString(arr));
  }


  public static void main(String[] args) {
    impl(new int[]{0,1,0,3,12});

  }

}
