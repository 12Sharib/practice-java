package Intervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
  private static void impl(int [][] arr){
    Arrays.sort(arr, (a,b) -> (a[1]- b[1]));

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();
    temp.add(arr[0][0]);
    temp.add(arr[0][1]);
    ans.add(temp);

    for (int i=1;i<arr.length;i++){
      ArrayList<Integer> last = ans.get(ans.size()-1);
      int a = last.get(0);
      int b = last.get(1);
      int c = arr[i][0];
      int d = arr[i][1];

      if( b >= c){
        last.set(0,Math.min(a,c));
        last.set(1,Math.max(b,d));
      }else{
        ArrayList<Integer> curr = new ArrayList<>();
        curr.add(c);
        curr.add(d);
        ans.add(curr);
      }
    }

    System.out.println(ans);

  }

  public static void main(String[] args) {
    impl(new int[][]{ {1,4},{4,5}});
  }

}
