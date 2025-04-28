package HashMap;

import java.util.Arrays;

public class LongestConsecutiveSequence {
  private static void impl(int [] arr){
    Arrays.sort(arr);
    int count=1;

    int max = 0;
    for (int i=1;i< arr.length;i++){
      if (arr[i] == arr[i-1] + 1){
        count++;

        max = Math.max(count, max);
      }else {
        count=1;
      }
    }
    System.out.println(max);

  }

  public static void main(String[] args) {
    impl(new int[]{100,4,200,1,3,2, 201,202,203,204,205});
  }

}
