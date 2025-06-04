package BinarySearch;

public class SearchInsertPosition {
  private static void impl(int [] nums, int target){

    int start= 0;
    int end= nums.length-1;
    int ans = nums.length;
    while(start <= end){

      int mid = (start + end)/2;

      if(nums[mid] == target){
        System.out.println(mid);
        break;
      }else if(nums[mid] < target){
        start = mid + 1;
      } else{
        end = mid - 1;
      }
    }

    System.out.println(start);

  }

  public static void main(String[] args) {
    impl(new int[]{1,3,5,6}, 2);

  }

}
