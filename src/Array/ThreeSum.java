package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  private static void impl(int[] arr) {
    System.out.println("Ques: " + Arrays.toString(arr));

    Arrays.sort(arr);

    List<List<Integer>> value = new ArrayList<>();

    int i = 0;
    int j = 1;
    int k = 2;

    while (i < arr.length && j < arr.length && k < arr.length) {
      if (arr[i] + arr[j] + arr[k] == 0) {
        value.add(List.of(arr[i], arr[j], arr[k]));
      }
      i++;
      j++;
      k++;

    }
    System.out.println(value);

  }

  public static void main(String[] args) {
    impl(new int[]{-1, 0, 1, 2, -1, -4});
  }

}
