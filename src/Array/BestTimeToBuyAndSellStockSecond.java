package Array;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockSecond {
  private static void impl(int [] arr){
    System.out.println("Ques: " + Arrays.toString(arr));

    int left = 0;
    int right = 1;

    int max = 0;

    while (left < arr.length && right < arr.length){
      int sell = arr[right] - arr[left];

      if (sell < 0){
        left++;
        right = left+1;
      }else {
        max += sell;
        left++;
        right++;
      }
    }
    System.out.println(max);

  }

  public static void main(String[] args) {
    impl(new int[]{7,1,5,3,6,4});

  }

}
