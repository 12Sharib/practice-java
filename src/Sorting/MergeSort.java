package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeSort {
  private static void impl(int [] arr){
    System.out.println("Ques: " + Arrays.toString(arr));
    
    mergeSort(arr, 0, arr.length-1);

    System.out.println(Arrays.toString(arr));
  }

  private static void mergeSort(int[] arr, int low, int high) {
    if (low >= high){
      return;
    }
    int mid = (low + high)/2;
    
    // Left Part
    mergeSort(arr, low, mid);
    
    // Right Part
    mergeSort(arr, mid+1, high);
    
    // Merge
    mergeArr(arr, low, mid, high);
  }

  private static void mergeArr(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> list = new ArrayList<>();

    int left = low;
    int right = mid+1;

    while (left<= mid && right <= high){
      if (arr[left] <= arr[right]){
        list.add(arr[left]);
        left++;
      }else {
        list.add(arr[right]);
        right++;
      }
    }
    while (left<= mid){
      list.add(arr[left]);
      left++;
    }
    while (right<= high){
      list.add(arr[right]);
      right++;
    }

    for (int i=low;i<= high;i++){
      arr[i] = list.get(i-low);
    }
  }

  public static void main(String[] args) {
    impl(new int[]{13,46,24,52,20,9});
  }

}
