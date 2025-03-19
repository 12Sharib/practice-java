package Sorting;

import java.util.Arrays;

public class InsertionSort {
  private static void impl(int [] arr){
    System.out.println("Ques: " + Arrays.toString(arr));

    for(int i=1;i< arr.length-1;i++){
      int current = arr[i];
      int prev = i -1;

      while (prev >= 0 && arr[prev] > current){
        arr[prev+1] = arr[prev];
        prev--;
      }
      arr[prev+1] = current;
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    impl(new int[]{4, 1, 3, 9, 7});

  }

}
