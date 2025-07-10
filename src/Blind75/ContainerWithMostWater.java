package Blind75;

public class ContainerWithMostWater {

  private static void impl(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    int max = 0;


    while (start < end){
      if (arr[start] < arr[end]){
        int value = arr[start] * (end - start);
        max = Math.max(max, value);

        start++;
      }else {
        int value = arr[end] * (end - start);
        max = Math.max(max, value);
        end--;
      }
    }
    System.out.println(max);
  }

  public static void main(String[] args) {
    impl(new int[]{1,8,6,2,5,4,8,3,7});

  }

}
