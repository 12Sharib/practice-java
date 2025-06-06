package BitManipulation;

import java.util.Arrays;

public class SingleNumberSecond {
  private static void impl(int [] arr){
    Arrays.sort(arr);
    int ans = 0;

    for(int i=1;i<arr.length;i=i+3){
      if(arr[i] != arr[i-1]){
        ans = arr[i-1];

      }
    }
    if(ans == 0){
      System.out.println(arr[arr.length-1]);
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    impl(new int[]{2,2,3,2});

  }

}
