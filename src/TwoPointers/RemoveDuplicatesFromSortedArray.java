package TwoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

  private static void impl(int arr[]) {

    // Brute force

    Set<Integer> set = new HashSet<>();

    for (int value : arr) {
      set.add(value);
    }
    System.out.println(set.size());


    int count = 1;

    int start = 0;
    int end = 1;

    while (end < arr.length){
      if (arr[start] != arr[end]){
        start++;
        int c = arr[start];
        arr[start] = arr[end];
        arr[end] = c;

        end++;
      }else {
        end++;
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(start+1);

  }

  public static void main(String[] args) {
    impl(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
  }

}
