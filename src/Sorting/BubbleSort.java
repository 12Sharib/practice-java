package Sorting;

import java.util.Arrays;

public class BubbleSort {

  private static void impl(int[] arr) {
    System.out.println("Ques: " + Arrays.toString(arr));
    // Finding the large elements and to last

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    impl(new int[]{4, 1, 3, 9, 7});

  }

}
