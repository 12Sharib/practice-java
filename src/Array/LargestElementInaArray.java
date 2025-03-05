package Array;

import java.util.Arrays;

public class LargestElementInaArray {

  private static Integer impl(int[] arr) {
    System.out.println("Ques: " + Arrays.toString(arr));

    int max = arr[0];


    for(int i=0;i< arr.length;i++){
      if (max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Integer max = impl(new int[]{1,4,2,3});
    System.out.println(max);

  }

}
