package Backtracking;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Permute {

  private static void find(List<List<Integer>> list, int[] nums, int index, List<Integer> temp) {
    if (index == nums.length) {
      list.add(new ArrayList<>(temp));
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      if (temp.contains(nums[i])) {
        continue;
      }
      temp.add(nums[i]);

      find(list, nums, index + 1, temp);
      temp.remove(temp.size() - 1);
    }


  }

  public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        find(list, new int[]{1,2,3}, 0, new ArrayList<>());
        System.out.println(list);

  }
}