package Array;

import java.util.Arrays;

public class SecondLargest {

  private static int impl(int[] arr) {
    System.out.println("Ques: " + Arrays.toString(arr));

    int max = arr[0];
    int secondLast = -1;
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        secondLast = max;
        max = arr[i];
      } else if (arr[i] > secondLast && arr[i] != max) {
        secondLast = arr[i];
      }
    }


    return secondLast;
  }

  public static void main(String[] args) {
    Integer max = impl(new int[]{10, 1, 2});

    System.out.println(max);
  }

}
