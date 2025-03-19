package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {

  private static void impl(int number) {
    System.out.println("Ques: " + number);
    Map<Integer, String> map = new LinkedHashMap<>();
    map.put(1000, "M");
    map.put(900, "CM");
    map.put(500, "D");
    map.put(400, "CD");
    map.put(100, "C");
    map.put(90, "XC");
    map.put(50, "L");
    map.put(40, "XL");
    map.put(10, "X");
    map.put(9, "IX");
    map.put(5, "V");
    map.put(4, "IV");
    map.put(1, "I");

    StringBuilder stringBuilder = new StringBuilder();

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      while (number >= entry.getKey()) {
        stringBuilder.append(entry.getValue());
        number -= entry.getKey();
      }
    }


//    MMMDCCXLIX
    System.out.println(stringBuilder);


  }

  public static void main(String[] args) {
    impl(3749);
  }

}
