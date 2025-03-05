package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

//  Pending
  private static void impl(int[] arr) {
    System.out.println("Ques: " + Arrays.toString(arr));

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length-1; i++) {
      if (!list.contains(arr[i])){
        list.add(arr[i]);
      }
      list.add(0);

    }
    for (int i=0;i<list.size()-1;i++){
      arr[i] = list.get(i);
    }

    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
impl(new int[]{1,2,3,1,2,5});
  }

}
