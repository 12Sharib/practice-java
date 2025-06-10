package SlidingWindow;

public class LongestEvenOddSubarrayWithThreshold {

  private static void impl(int[] arr, int threshold) {


    int i = 0;
    int max = 0;
    while (i < arr.length) {
      int count = 0;
      if (arr[i] %2 == 0 && arr[i] <= threshold){
        count++;

        while (i+1<arr.length){
          if (arr[i] %2 != arr[i+1]%2 && arr[i] <=  threshold && arr[i+1] <= threshold){
            count++;
          }else {
            break;
          }
          i++;
        }
        max = Math.max(max, count);
      }
      i++;
    }
    System.out.println(max);

  }

  public static void main(String[] args) {
    impl(new int[]{3, 2, 5, 4}, 5);
  }

}
