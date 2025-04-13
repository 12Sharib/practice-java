package TwoPointers;

public class ContainerWithMaxWater {

  private static void impl(int[] arr) {

    int maxWater = 0;
// Brute Force
//    for (int i=0;i<arr.length;i++){
//      for (int j=i+1;j< arr.length;j++){
//        int width = j-i;
//        int height = Math.min(arr[i], arr[j]);
//
//        int area = width *  height;
//
//        maxWater = Math.max(area, maxWater);
//      }
//    }
//    System.out.println(maxWater);

//    Two Pointer
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      maxWater = Math.max(maxWater, (right - left) * Math.min(arr[left], arr[right]));

      if (arr[left] < arr[right]) {
        left++;
      } else {
        right--;
      }
    }
    System.out.println(maxWater);

  }

  public static void main(String[] args) {
    impl(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
  }

}
