package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

  private static void impl(int[] arr) {
    int[] ans = new int[arr.length];

//  for (int i=0;i<arr.length;i++){
//    int mul = 1;
//    for (int j=0;j< arr.length;j++){
//      if (i == j){
//        continue;
//      }else {
//        mul *= arr[j];
//      }
//    }
//    ans[i] = mul;
//  }

    int [] prefix = new int[arr.length];
    int [] suffix = new int[arr.length];

    prefix[0] = 1;
    for (int i = 1; i < arr.length; i++) {
      prefix[i] = arr[i - 1] * prefix[i - 1];
    }

    suffix[arr.length -1] =1;
    for (int i = arr.length -2; i >= 0; i--) {
      suffix[i] = arr[i + 1] * suffix[i + 1];
    }

    for (int i=0;i< arr.length;i++){
      ans[i] = suffix[i] * prefix[i];
    }

    System.out.println(Arrays.toString(ans));
  }

  public static void main(String[] args) {
    impl(new int[]{-1,1,0,-3,3});
  }

}
