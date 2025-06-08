package SlidingWindow;

public class MaximumAverageSubarrayI {
  private static void impl(int [] arr, int k){

    int sum = 0;
    int maxSum = 0;

    for (int i=0;i<k;i++){
      sum += arr[i];
    }
    int j=0;
    maxSum = sum;

    for (int i=k;i<arr.length;i++){
      sum -= arr[j];
      sum += arr[k + j];
      maxSum = Math.max(maxSum, sum);
      j++;
    }
    System.out.println(maxSum / k);

  }

  public static void main(String[] args) {
    impl(new int[]{5}, 1);

  }

}
