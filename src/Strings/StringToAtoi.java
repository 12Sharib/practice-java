package Strings;

public class StringToAtoi {
  private static void impl(String num){
     String trim = num.trim();


   int i=0;
   int ans = 0;
   int sign = 1;

   if (trim.charAt(i) == '-' || trim.charAt(i) == '+'){
     sign = trim.charAt(i) == '-'?-1:1;
     i++;
   }
   while (i<trim.length() && Character.isDigit(trim.charAt(i))){
     ans = (ans * 10) + (trim.charAt(i) - '0');

     i++;
   }

   if (ans * sign > Integer.MAX_VALUE){
     System.out.println(Integer.MAX_VALUE);
   }
   if (ans * sign < Integer.MIN_VALUE){
     System.out.println(Integer.MIN_VALUE);
   }
    System.out.println(ans);





  }

  public static void main(String[] args) {
    impl("  -042");

  }

}
