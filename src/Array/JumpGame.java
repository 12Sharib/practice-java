package Array;

import java.util.Arrays;

public class JumpGame {

  private static void impl(int[] arr) {
    System.out.println("Ques: " + Arrays.toString(arr));

    int lastpos = arr.length -1;
    for (int i = arr.length-2; i >= 0 ; i--) {

      if (arr[i] + i >= lastpos){
        lastpos = i;
      }

    }
    System.out.println(lastpos == 0);

  }

  public static void main(String[] args) {
    impl(new int[]{2,3,1,1,4});

  }

}
