package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RangeSumOfSortedSubarraySums {

  private static void impl(int[] nums, int n, int left, int right) {

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += nums[j];
        list.add(sum);
      }
    }

    Collections.sort(list);
    Long sum = 0L;
    int i = left;
    while (i <= right) {
      sum += list.get(i-1);
      i++;
    }

    System.out.println(list);
    System.out.println(sum);
  }

  public static void main(String[] args) {
    impl(new int[]{1, 2, 3, 4}, 4, 1, 5);
  }
}
