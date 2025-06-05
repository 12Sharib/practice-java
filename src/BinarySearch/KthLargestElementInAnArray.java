package BinarySearch;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

  private static void impl(int[] arr, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    int ans = 0;

    for (int i = 0; i < arr.length; i++) {
      minHeap.add(arr[i]);

      if (minHeap.size() == k) {
        ans = Math.max(ans, minHeap.poll());
      }
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    impl(new int[]{3, 2, 1, 5, 6, 4}, 2);
  }

}
