package Array;

import java.util.Arrays;

public class MergeSortedArray {

  private static void impl(int[] arr1, int[] arr2) {
    int i = 3 - 1;
    int j = 3 - 1;
    int k = 3 + 3 - 1; // Last position in arr1

    // Merge from the end to the beginning
    while (i >= 0 && j >= 0) {
      if (arr1[i] > arr2[j]) {
        arr1[k--] = arr1[i--];
      } else {
        arr1[k--] = arr2[j--];
      }
    }

    while (j >= 0) {
      arr1[k--] = arr2[j--];
    }

    System.out.println(Arrays.toString(arr1));
  }

  public static void main(String[] args) {
    impl(new int[]{4,5,6,0,0,0}, new int[]{1,2,3});
  }

}
