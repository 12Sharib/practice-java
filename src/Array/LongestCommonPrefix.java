package Array;

import java.util.Arrays;

public class LongestCommonPrefix {
  private static void impl(String [] strings) {
    System.out.println("Ques: " + Arrays.toString(strings));

    StringBuilder stringBuilder = new StringBuilder();

    Arrays.sort(strings);

    int length = strings.length-1;
    int i=0;
    while (i < strings[0].length() && i < strings[length].length()){
      if (strings[0].charAt(i) == strings[length].charAt(i)){
        stringBuilder.append(strings[0].charAt(i));
        i++;
      }else {
        break;
      }
    }

    System.out.println(stringBuilder);
  }

  public static void main(String[] args) {
    impl(new String[]{"dog","racecar","car"});

  }

}
