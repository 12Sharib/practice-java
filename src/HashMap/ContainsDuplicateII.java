package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
  private static void impl(int [] arr, int k){
    Map<Integer, Integer> map = new HashMap<>();

    for (int i=0;i< arr.length;i++){
      if (map.containsKey(arr[i])){
        int value = Math.abs(map.get(arr[i]) -i);
        if (value <= k){
          System.out.println(true);
          break;
        }else {
          map.put(arr[i], i);
        }
      }else{
        map.put(arr[i], i);
      }
    }
  }

  public static void main(String[] args) {
    impl(new int[]{1,0,1,1}, 1);

  }

}
