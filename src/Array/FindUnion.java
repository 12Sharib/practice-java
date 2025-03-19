package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUnion {
  private static ArrayList<Integer> impl(int []a, int []b){
    Set<Integer>  integers = new HashSet<>();
    for (int i=0;i<a.length;i++){
      integers.add(a[i]);
      integers.add(b[i]);
    }integers.stream().sorted();
   for(int i=0;i<integers.size();i++){

   }
   return null;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = impl(new int[]{2, 2, 3, 4, 5}, new int[]{1, 1, 2, 3, 4});
    System.out.println(list);

  }

}
