package Blind75;

public class NiceSubArrays {
  private static Integer impl(int [] arr, int k){
    int l=0;
    int r=0;
    int ans = 0;
    int sum=0;
    while (r<arr.length){
      sum += arr[r]%2;

      while (sum > k){
        sum = sum -(arr[l] % 2);
        l++;
      }
      ans= ans + (r-l+1);
      r++;
    }
    return ans;
  }


  public static void main(String[] args) {
    int ans = impl(new int[]{1,1,2,1,1}, 3) - impl(new int[]{1,1,2,1,1}, 2);
    System.out.println(ans);

  }

}
