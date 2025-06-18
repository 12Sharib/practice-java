package TwoPointers;

import java.util.Arrays;

public class MergeSortedArray {

  private static void impl(int[] arr1, int m, int[] arr2, int n) {



    int k = m+n-1;
    while (m>0 && n>0){

      if (arr1[m-1] > arr2[n-1]){
        arr1[k] = arr1[m-1];
        k--;
        m--;
      }else {
        arr1[k] = arr2[n-1];
        k--;
        n--;
      }
    }
    for (int i=0;i<n;i++){
      arr1[i] = arr2[i];
    }

    System.out.println(Arrays.toString(arr1));

  }

  public static void main(String[] args) {
    impl(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);

  }

}
