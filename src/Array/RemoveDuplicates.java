package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

  //  Pending
  private static void impl(int[] arr) {
    System.out.println("Ques: " + Arrays.toString(arr));

    Set<Integer> integers = new HashSet<>();

    int j = 0;
    for (int i = 1; i < arr.length; i++) {

      if (arr[i] != arr[j]) {
        j++;
        arr[j] = arr[i];
      }
    }

    System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(arr, j + 1)));
  }

  public static void main(String[] args) {
    impl(new int[]{1, 2, 2, 3, 5});
  }

}
