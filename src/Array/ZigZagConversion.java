package Array;

import java.util.Arrays;

public class ZigZagConversion {
  private static void impl(String string, int rows){
    String [] arr = new String[rows];

    Arrays.fill(arr, "");

    int i=0;
    while (i<string.length()){
      for (int index = 0;index<rows && i < string.length();index++){
        arr[index] += string.charAt(i);
        i++;
      }
      for (int rev = rows-2;rev > 0 && i< string.length() ;rev--){
        arr[rev] += string.charAt(i++);
      }
    }
    StringBuilder stringBuilder = new StringBuilder();
    for (String str:arr){
      stringBuilder.append(str);

    }
    System.out.println(stringBuilder);
  }

  public static void main(String[] args) {
    impl("PAYPALISHIRING",4);
  }

}
