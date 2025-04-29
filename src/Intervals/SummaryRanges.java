package Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {

  private static void impl(int[] arr) {
    List<String> list = new ArrayList<>();

    int i = 0;
    while (i < arr.length) {
      StringBuilder str = new StringBuilder();
      str.append(arr[i]);
      int j = i;
      while (j + 1 < arr.length && arr[j] == arr[j + 1] - 1) {
        j++;
      }
      if (i != j) {
        str.append("->" + arr[j]);

      }
      list.add(str.toString());
      i = j + 1;
    }
    System.out.println(list);
  }

  public static void main(String[] args) {
    impl(new int[]{0,1,2,4,5,7});
  }

}
