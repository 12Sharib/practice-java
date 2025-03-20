package Array;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArraySecond {
  private static void impl(int [] arr){
    System.out.println("Ques: " + Arrays.toString(arr));


    int i=0;
    for(int n:arr){
      if (i<2 || n!=arr[i-2]){
        arr[i++] = n;
      }
    }
    System.out.println(i);
  }

  public static void main(String[] args) {
    impl(new int[]{1,1,1,2,2,3});

  }

}
