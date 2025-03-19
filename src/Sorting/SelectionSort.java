package Sorting;

import java.util.Arrays;

public class SelectionSort {

  private static void impl(int[] arr) {
    System.out.println("Ques: " + Arrays.toString(arr));

//     What is section sort
//    it is sorting algo first we need to find the smallest element then move to first place
    for (int i = 0; i < arr.length; i++) {
      int smallest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[smallest] > arr[j]) {
          smallest = j;
        }
      }
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    impl(new int[]{4, 1, 3, 9, 7});
  }


}
