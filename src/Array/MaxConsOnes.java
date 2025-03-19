package Array;

import java.util.Arrays;

public class MaxConsOnes {
  private static void impl(int [] arr){
    System.out.println("Ques: " + Arrays.toString(arr));

    int i=0;
    int count = 0;
    int max = 0;

    while (i<arr.length ){
      if (arr[i] == 1){
        count++;
        max = Math.max(max,count);
      }else {
        count = 0;
      }
      i++;
    }
    System.out.println(max);
  }

  public static void main(String[] args) {
    impl(new int[]{1,1,0,1,1,1});
  }

}
