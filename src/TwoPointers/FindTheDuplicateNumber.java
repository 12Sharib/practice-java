package TwoPointers;

import java.util.Arrays;

public class FindTheDuplicateNumber {

  private static void impl(int [] nums){
//    Brute force
//    Arrays.sort(nums);
//    int dup = 0;
//
//    for (int i=1;i<nums.length;i++){
//      if(nums[i] == nums[i-1]){
//        dup = nums[i];
//        break;
//      }
//    }

//    Optimal
    int [] ans = new int[nums.length+1];
    int dup = 0;

    for (int i=0;i< nums.length;i++){
      ans[nums[i]]++;
    }

    for (int i=0;i< ans.length;i++){
      if (ans[i] > 1){
        dup = i;
      }
    }

    System.out.println(Arrays.toString(ans));
    System.out.println(dup);
  }

  public static void main(String[] args) {
    impl(new int[]{3,2,5,14,5,5,19,18,11,10,1,4,5,5,5,5,12,5,17,5});
  }

}
