package TwoPointers;

import java.util.Arrays;

public class ShortestDistanceToACharacter {

  private static void impl(String s, char c) {


    int[] ans = new int[s.length()];
    int index = -s.length();
    for (int i=0;i<s.length();i++){
      if (s.charAt(i) ==c){
        index = i;
      }
      ans[i] = i-index;
    }
    for (int i=s.length()-1;i>=0;i--){
      if (s.charAt(i) ==c){
        index = i;
      }
      ans[i] = Math.min(ans[i],Math.abs(i-index) );
    }

    System.out.println(Arrays.toString(ans));
  }

  public static void main(String[] args) {
    impl("loveleetcode", 'e');

  }

}
