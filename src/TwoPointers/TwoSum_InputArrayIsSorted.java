package TwoPointers;

import java.util.Arrays;

public class TwoSum_InputArrayIsSorted {
  private static void impl(int [] arr, int target){

    int left = 0;
    int right = arr.length-1;

    int [] ans = new int[2];

//    With TLE
//    while (left < right && right< arr.length){
//      if (arr[left] + arr[right] == target){
//        ans[i] = left+1;
//        ans[i+1] = right+1;
//
//        break;
//      } else {
//        right++;
//      }
//      if (right == arr.length){
//        left++;
//        right = left+1;
//      }
//    }
        while (left < right ){
      if (arr[left] + arr[right] == target){
        ans[0] = left+1;
        ans[1] = right+1;

        break;
      } else if (arr[left] + arr[right] < target){
        left++;
      }else{
        right--;
      }
    }
    System.out.println(Arrays.toString(ans));


  }

  public static void main(String[] args) {
    impl(new int[]{-10,-8,-2,1,2,5,6}, 0);

  }

}
