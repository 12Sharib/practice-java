package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

  private static void impl(int[] arr) {

//    Brute force
    Map<Integer, Integer> map = new HashMap<>();

    for (int value : arr) {
      if (map.containsKey(value)) {
        map.put(value, map.get(value) + 1);
      } else {
        map.put(value, 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > arr.length / 2) {
        System.out.println(entry.getKey());
        break;
      }
    }
    System.out.println(map);

//    Optimal
    int cand = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (count == 0){
        cand = arr[i];
      }
      if (cand == arr[i]){
        count++;
      }else {
        count--;
      }
    }
    System.out.println(cand);



  }

  public static void main(String[] args) {
    impl(new int[]{3, 2, 3});
  }

}
