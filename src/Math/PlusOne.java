package Math;

import java.util.Arrays;

public class PlusOne {

  private static void impl(int[] arr) {

    int carry = 0;

    if (arr[arr.length - 1] < 9) {
      arr[arr.length - 1] += 1;
    }
    arr[arr.length - 1] += 1;

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == 10) {
        arr[i] = 0;
        carry = 1;
      } else {
        arr[i] += carry;

        if (arr[i] == 10) {
          arr[i] = 0;
          carry = 1;
        }else {
          carry=0;
        }
      }
    }
    if (carry > 0) {
      int[] ans = new int[arr.length + 1];

      ans[0] = 1;

      for (int i = 1; i < arr.length; i++) {
        ans[i] = arr[i];
      }
      System.out.println(Arrays.toString(ans));

    }
    System.out.println(Arrays.toString(arr));


  }

  public static void main(String[] args) {
    impl(new int[]{8, 9, 9});
  }

}
