package Strings;

import java.util.Arrays;

class RepeatedSubString {
    public static void repeatedSubstringPattern(String s) {

      int  n = s.length();

      for (int i=n/2;i>0;i--){
          if (n%i == 0){
              String sub = s.substring(0, i);
              StringBuilder stringBuilder = new StringBuilder();

              for (int j=1;j<=n/i;j++){
                  stringBuilder.append(sub);
              }
              if (stringBuilder.toString().equals(s)){
                  System.out.println(true);
                  break;
              }
          }
      }
        System.out.println(false);

        
    }

    public static void main(String[] args) {
        repeatedSubstringPattern("abcabcabcabc");



    }
}