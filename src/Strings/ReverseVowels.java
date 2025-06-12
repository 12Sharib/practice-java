package Strings;

import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
  private static void impl(String string){

    StringBuilder s = new StringBuilder(string);

    int start = 0;
    int end = s.length() -1;


    List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    while(start < end){
      char left = s.charAt(start);
      char right = s.charAt(end);
      if(!list.contains(left)){
        start++;
      }else if(!list.contains(right)){
       end--;
      }else{
        s.setCharAt(start, right);
        s.setCharAt(end, left);
        start++;
        end--;
      }
    }
    System.out.println(s);
  }

  public static void main(String[] args) {
    impl("IceCreAm");
  }

}
