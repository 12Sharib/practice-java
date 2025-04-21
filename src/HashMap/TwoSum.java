package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  private static void impl(int [] arr, int target){
    Map<Integer, Integer> map = new HashMap<>();

    for (int i=0;i<arr.length;i++){
      int value = target - arr[i];
      if (map.containsKey(value)){
        System.out.println(map.get(value) + " " +i);
        break;
      }
        map.put(arr[i], i);

    }

  }

  public static void main(String[] args) {
    impl(new int[]{2,7,11,15}, 9);

  }

}
