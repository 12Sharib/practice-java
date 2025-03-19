package Array;

import java.util.Arrays;

public class RemoveElement {

  private static void impl(int[] arr, int val) {
    System.out.println("Ques: " + Arrays.toString(arr));

    int[] result = new int[arr.length];
    int j = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != val) {
        result[j] = arr[i];
        j++;
      }
    }

    for (int i = 0; i < j; i++) {
      arr[i] = result[i];
    }

    for (int i = j; i < arr.length; i++) {
      arr[i] = 0;
    }
    System.out.println(Arrays.toString(result));
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    impl(new int[]{2}, 3);

  }

}
