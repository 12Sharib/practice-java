package TwoPointers;

public class ContainerWithMostWater {

  private static void impl(int[] arr) {
//    int max = 0;
//
//    for (int i=0;i< arr.length;i++){
//      for (int j=i+1;j< arr.length;j++){
//        if (arr[i]< arr[j]){
//          int area = arr[i] * (j-i);
//          max = Math.max(area, max);
//        }else{
//          int area = arr[j] * (j-i);
//          max = Math.max(area, max);
//        }
//      }
//    }
//    System.out.println(max);

    int max = 0;

    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      if (arr[start] < arr[end]) {
        int area = arr[start] * (end - start);
        max = Math.max(area, max);
        start++;
      } else {
        int area = arr[end] * (end - start);
        max = Math.max(area, max);
        end--;
      }
    }
    System.out.println(max);

  }

  public static void main(String[] args) {

    impl(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

  }

}
