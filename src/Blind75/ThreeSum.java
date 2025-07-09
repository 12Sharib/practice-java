package Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

  private static void impl(int[] arr) {
    Set<List<Integer>> set = new HashSet<>();
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {

      int j = i + 1;
      int k = arr.length - 1;

      while (j < k) {
        int sum = arr[i] + arr[j] + arr[k];

        if (sum > 0) {
          k--;
        } else if (sum < 0) {
          j++;
        } else {

          List<Integer> list = new ArrayList<>();
          list.add(arr[i]);
          list.add(arr[j]);
          list.add(arr[k]);

          set.add(list);
          j++;
          k--;
        }
      }

    }
    System.out.println(set);
  }

  public static void main(String[] args) {
    impl(new int[]{-1, 0, 1, 2, -1, -4});
  }

}
