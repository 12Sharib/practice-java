package Array;

import java.util.Arrays;

public class GasStation {

  private static void impl(int [] gas, int [] cost){
    System.out.println("Ques: " + Arrays.toString(gas));
    int totalgas = 0;

    for(int i:gas){
      totalgas += i;
    }
    int totalcost = 0;
    for(int i:cost){
      totalcost+=i;
    }
    if(totalgas< totalcost){
      return;
    }
    int start=0;
    int curr=0;

    for(int i=0;i<gas.length;i++){
      curr += gas[i] - cost[i];

      if(curr < 0){
        start = i+1;
        curr = 0;
      }
    }
    System.out.println(start);

  }
  public static void main(String[] args) {
    impl(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});


  }

}
