package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kthLargestElement {

  private static void impl(int[] arr, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {

      minHeap.add(arr[i]);
      if (minHeap.size() == k) {
        ans = Math.max(ans, minHeap.poll());
      }
    }
    System.out.println(ans);
  }


  public static void main(String[] args) {
    impl(new int[]{3, 2, 1, 5, 6, 4}, 3);
  }

}
