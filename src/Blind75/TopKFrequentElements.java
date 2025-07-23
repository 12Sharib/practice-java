package Blind75;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

  private static void impl(int[] nums, int k) {
    Map<Integer, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    Map<Integer, Integer> orderedMap = new LinkedHashMap<>();
    map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(x -> orderedMap.put(x.getKey(), x.getValue()));

    int[] ans = new int[k];

    int i = 0;
    for (int key : orderedMap.keySet()) {

      if (i != k) {
        ans[i] = key;
        i++;
      } else {
        break;
      }


    }

    System.out.println(Arrays.toString(ans));

  }

  public static void main(String[] args) {
    impl(new int[]{2, 2, 3, 1, 1, 1}, 2);


  }

}
