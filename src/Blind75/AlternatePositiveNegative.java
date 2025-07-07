package Blind75;

import java.util.Arrays;
import java.util.List;

public class AlternatePositiveNegative {

  private static void impl(List<Integer> arr) {
    int n = arr.size();
    int[] positive = new int[n];
    int[] negative = new int[n];

    int posCount = 0;
    int negCount = 0;

    for (int i = 0; i < n; i++) {
      if (arr.get(i) < 0) {
        negative[negCount] = arr.get(i);
        negCount++;
      } else {
        positive[posCount] = arr.get(i);
        posCount++;
      }
    }

    int i = 0;
    int j = 0;
    int k = 0;

    while (j < posCount && k < negCount) {
      arr.set(i++, positive[j++]);
      arr.set(i++, negative[k++]);
    }
    while (j < posCount && i < n) {
      arr.set(i++, positive[j++]);
    }

    while (k < negCount && i < n) {
      arr.set(i++, negative[k++]);
    }
    System.out.println(arr);

  }

  public static void main(String[] args) {
    impl(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));
  }

}
