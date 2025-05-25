package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

  private static void impl() {
    String digits = "";
    Map<Character, String> map = new HashMap<>();
    map.put('1', " ");
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");

    List<String> list = new ArrayList<>();

    findCom(list, map, 0, new StringBuilder(), digits);

    System.out.println(list);
  }

  private static void findCom(List<String> list, Map<Character, String> map, int index,
      StringBuilder stringBuilder, String digits) {

    if (index == digits.length()){
      list.add(stringBuilder.toString());
      return;
    }

    String letters = map.get(digits.charAt(index));

    for (int i=0;i<letters.length();i++){
      stringBuilder.append(letters.charAt(i));
      findCom(list, map, index+1, stringBuilder, digits);
      stringBuilder.deleteCharAt(stringBuilder.length()-1);

    }



  }

  public static void main(String[] args) {
    impl();

  }

}
