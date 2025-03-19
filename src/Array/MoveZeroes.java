package Array;

import java.util.Arrays;

public class MoveZeroes {

  private static void impl(int[] arr) {
    System.out.println("Ques: " + Arrays.toString(arr));


    if(arr.length == 1){
      return;
    }

    int j=-1;
    for(int i=0;i<arr.length;i++){
      if(arr[i] == 0){
        j=i;
        break;
      }
    }

    for(int i=j+1;i<arr.length;i++){
      if(arr[i]!=0){
        int s = arr[i];
        arr[i] = arr[j];
        arr[j] = s;

        j++;
      }
    }
    System.out.println(Arrays.toString(arr));

  }

  public static void main(String[] args) {
    impl(new int[]{0,0,0,1,1,0});
  }

}
