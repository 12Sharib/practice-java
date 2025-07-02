package Array;

import java.util.Arrays;
import java.util.HashMap;

public class SubarraySumEqualsK {

  private static void impl(int[] arr, int k) {
    int count = 0;

//    for (int i = 0; i < arr.length; i++) {
//      int sum = 0;
//      for (int j = i; j < arr.length; j++) {
//        sum += arr[j];
//        if (sum == k) {
//          count++;
    //      }
//      }
//    }

    HashMap<Integer, Integer> map = new HashMap<>();
//123
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i]; // 1

      if (sum == k) {
        count++; // 1
      }

      if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1); // 1, 0 // 0, 1

    }

    System.out.println(count);

    int start = 0;
    int end = arr.length - 1;

//    while(arr[start] !=0){
//      start++;
//    }

//    for non-relative order move zeroes
    while (start < end) {
      if (arr[start] == 0 && arr[end] != 0) {
        int a = arr[start];
        arr[start] = arr[end];
        arr[end] = a;
        start++;
        end--;
      } else if (arr[end] == 0) {
        end--;
      } else {
        start++;
      }
    }

//    for relative order
    while (start < end) {
      if (arr[start] != 0) {
        start++;
        end = start + 1;
      } else if (arr[start] == 0 && arr[end] != 0) {
        int a = arr[start];
        arr[start] = arr[end];
        arr[end] = a;
        start++;
        end = start + 1;
      } else {
        end--;
      }
    }
    System.out.println(Arrays.toString(arr));


  }

  public static void main(String[] args) {
    impl(new int[]{1, 2, 3}, 3);
  }

}

/*

1 2 3
1 3 6

    currSum = 1;
1->0
cnt = 1;

sum = 3
3->i;
cnt = 1;

sum = 6;
cnt++;
6,i;

*/