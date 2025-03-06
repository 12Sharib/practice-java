package Array;

import java.util.Arrays;

public class RotateArray {

  public static void rotate(int[] arr, int k) {

    int n = arr.length;
    k = k % n;

    reverseele(arr, 0, arr.length - 1);

    reverseele(arr, 0, k - 1);
    reverseele(arr, k, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }

  private static void reverseele(int[] arr, int i, int length) {
    int start = i;
    int end = length;

    while (start < end) {
      int s = arr[start];
      arr[start] = arr[end];
      arr[end] = s;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);

  }

}
