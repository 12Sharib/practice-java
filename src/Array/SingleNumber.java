package Array;

import java.util.Arrays;

public class SingleNumber {
  private static void impl(int [] arr){
    System.out.println("Ques: " + Arrays.toString(arr));

  int result = 0;
    for (int i=0;i<arr.length;i++){
     result ^=arr[i];
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    impl(new int[]{4,1,2,1,2});

  }

}
