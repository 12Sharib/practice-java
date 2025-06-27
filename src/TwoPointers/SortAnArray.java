package TwoPointers;

import java.util.Arrays;

public class SortAnArray {

  private static void sort(int [] arr){
    sortArray(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  private static void sortArray(int[] arr, int start, int end) {
    if (start>=end){
      return;
    }
    int mid = (start + end)/2;

    sortArray(arr, start, mid);
    sortArray(arr, mid+1, end);
    merge(arr, start, mid, end);


  }

  private static void merge(int[] arr, int start, int mid, int end) {
    int [] left = new int[mid - start+1];
    int i=0;
    while (i<left.length){
      left[i] = arr[start + i];
      i++;
    }
    int [] right = new int[end-mid];
    int j=0;
    while (j<right.length){
      right[j] = arr[mid + 1+ j];
      j++;
    }

    i=0;
    j=0;
    int k=start;

    while (i<left.length && j<right.length){
      if (left[i] <= right[j]){
        arr[k] = left[i];
        i++;
        k++;
      }else {
        arr[k] = right[j];
        j++;
        k++;
      }
    }
    while (i<left.length){
      arr[k] = left[i];
      i++;
      k++;
    }
    while (j<right.length){
      arr[k] = right[j];
      j++;
      k++;
    }

  }

  public static void main(String[] args) {
    sort(new int[]{5,2,3,1});

  }

}
