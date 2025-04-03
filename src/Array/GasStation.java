package Array;

import java.util.Arrays;

public class GasStation {

  private static void impl(int [] gas, int [] cost){
    System.out.println("Ques: " + Arrays.toString(gas));
  }
  public static void main(String[] args) {
    impl(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});
  }

}
