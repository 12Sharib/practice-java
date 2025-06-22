package TwoPointers;

import java.util.Arrays;

public class SortColors {

  private static void impl(int[] arr) {

//    int red = 0;
//    int white = 0;
//    int blue = 0;
//
//    for (int i=0;i<arr.length;i++){
//      if (arr[i] == 0){
//        red++;
//      } else if (arr[i] == 1) {
//        white++;
//      }else {
//        blue++;
//      }
//    }
//
//    int i=0;
//    while (red > 0){
//      arr[i] = 0;
//      i++;
//      red--;
//    }
//
//    while(white >0){
//      arr[i] = 1;
//      i++;
//      white--;
//    }
//    while (blue > 0){
//      arr[i] = 2;
//      i++;
//      blue--;
//    }

    int[] ans = new int[3];

    for (int i = 0; i < arr.length; i++) {
      ans[arr[i]]++;
    }

    int i = 0;
    int k = 0;
    while (i < ans.length && k< arr.length) {

      if (ans[i] > 0){
        arr[k] = i;
        ans[i]--;
        k++;
      }else {
        i++;
      }
    }

    System.out.println(Arrays.toString(arr));

  }

  public static void main(String[] args) {
    impl(new int[]{2,0,2,1,1,0});

  }

}
