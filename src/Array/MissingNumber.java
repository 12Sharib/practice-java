package Array;

import java.util.Arrays;

public class MissingNumber {
  private static void impl(int [] arr){
    System.out.println("Ques: " + Arrays.toString(arr));

    Arrays.sort(arr);
    int i;
    for (i=0;i < arr.length;i++){
      if (arr[i] != i){
        System.out.println(i);
        break;
      }
    }
    System.out.println(i);


  }

  public static void main(String[] args) {
  impl(new int[]{0,1});
  }

}
