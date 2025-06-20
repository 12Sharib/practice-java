package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

  private static void impl(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();

//    Brute
    if (nums1.length < nums2.length) {
      for (int i = 0; i < nums1.length; i++) {
        for (int j = 0; j < nums2.length; j++) {
          if (nums1[i] == nums2[j]) {
            list.add(nums1[i]);
          }
        }
      }
    } else {
      for (int i = 0; i < nums2.length; i++) {
        for (int j = 0; j < nums1.length; j++) {
          if (nums2[i] == nums1[j]) {
            list.add(nums2[i]);
          }
        }
      }
    }



    System.out.println(Arrays.toString(list.stream().toArray()));
  }

  public static void main(String[] args) {
    impl(new int[]{4,9,5}, new int[]{9,4,9,8,4});
  }

}
