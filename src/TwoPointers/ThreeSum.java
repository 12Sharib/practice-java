package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

  private static void impl(int[] arr) {
    Set<List<Integer>> lists = new HashSet<>();


    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      int j = i + 1;
      int k = arr.length - 1;

      while (j < k) {
        int sum = arr[i] + arr[j] + arr[k];
        if (sum < 0) {
          j++;
        } else if (sum > 0) {
          k--;
        } else {
          lists.add(List.of(arr[i], arr[j], arr[k]));
          j++;
          k--;
        }
      }
    }
    System.out.println(lists.stream().toList());

  }

  public static void main(String[] args) {
    impl(new int[]{-1, 0, 1, 2, -1, -4});

  }

}
