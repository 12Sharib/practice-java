package Blind75;

public class SearchInRotatedSortedArray {

  private static void impl(int[] arr, int tar) {

    int start = 0;
    int end = arr.length - 1;
    int ans = -1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (arr[mid] == tar) {
        ans = mid;
        break;
      }

      if (arr[start] <= arr[mid]) {
        if (tar >= arr[start] && tar <= arr[mid]) {
          end = mid-1;
        } else {
          start = mid + 1;
        }
      } else {
         if(tar >= arr[mid] && tar <= arr[end]){
           start = mid + 1;
         }else{
           end = mid-1;
         }
      }
    }
    System.out.println(ans);

  }

  public static void main(String[] args) {
    impl(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);

  }

}
