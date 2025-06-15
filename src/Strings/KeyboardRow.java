package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

  private static void impl(String[] arr) {


    String s = "qwertyuiop";

    if (s.contains("weyu")){
      System.out.println("done");
    }
    List<String> ans = new ArrayList<>();

    List<String> keyboard = Arrays.asList("asdfghjkl", "qwertyuiop", "zxcvbnm");
    for (String str:arr){
      String value = str.toLowerCase();
      for (String string : keyboard) {
        int k=0;
        for(int i=0;i<value.length();i++){
          if (string.contains(String.valueOf(value.charAt(i)))){
            k++;
          }else {
            break;
          }
          if (k == value.length()){
            ans.add(str);
          }
        }
      }
    }
    System.out.println(Arrays.toString(ans.toArray()));

  }

  public static void main(String[] args) {

    impl(new String[]{"Hello", "Alaska", "Dad", "Peace"});

  }

}
