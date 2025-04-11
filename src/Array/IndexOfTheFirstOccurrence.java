package Array;

import java.util.Arrays;

public class IndexOfTheFirstOccurrence {
  private static void impl(String haystack, String niddle){


     if (haystack.contains(niddle)){
      for (int i=0;i<haystack.length();i++){
        if (haystack.charAt(i) == niddle.charAt(0)) {
          if (haystack.substring(i, niddle.length() + i).equals(niddle)){
            System.out.println(i);
            break;
          }
        }
      }

    }
  }

  public static void main(String[] args) {
impl("hello", "ll");
  }

}
