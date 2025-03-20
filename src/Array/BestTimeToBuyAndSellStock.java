package Array;

public class BestTimeToBuyAndSellStock {

  private static void impl(int[] arr) {
//    7,1,5,3,6,4
    int left = 0;
    int right = 1;

    int max = 0;

    while (left < arr.length && right< arr.length){


      int sell = arr[right] - arr[left];

      if (sell < 0){
        left++;
        right = left+1;
      }else {
        max = Math.max(max, sell);
        right++;
      }
    }
    System.out.println(max);


  }

  public static void main(String[] args) {
    impl(new int[]{2,1,2,1,0,1,2});
  }

}
