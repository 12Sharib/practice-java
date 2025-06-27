package TwoPointers;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

  private static void impl(int[] nums1, int[] nums2) {

    int[] ans = new int[nums1.length + nums2.length];

    int i = 0;
    int j = 0;
    int k = 0;

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        ans[k] = nums1[i];
        i++;
        k++;
      } else {
        ans[k] = nums2[j];
        j++;
        k++;
      }
    }

    while (i < nums1.length) {
      ans[k] = nums1[i];
      i++;
      k++;
    }
    while (j < nums2.length) {
      ans[k] = nums2[j];
      j++;
      k++;
    }

    int mid = ans.length / 2;

    double value = ((double) ans[mid - 1] + ans[mid]) / 2;

    System.out.println(value);
    System.out.println(mid);

    System.out.println(Arrays.toString(ans));

  }

  public static void main(String[] args) {
    impl(new int[]{1, 2, 3}, new int[]{3, 3});

  }

}
