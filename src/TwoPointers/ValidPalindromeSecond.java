package TwoPointers;

public class ValidPalindromeSecond {

  private static boolean impl(String s){
    int start = 0;
    int end = s.length()-1;

    while (start<end){
      if (s.charAt(start) == s.charAt(end)){
        start++;
        end--;
      }else{
        return isPallin(start+1, end, s) || isPallin(start, end-1, s);
      }
    }
    return true;
  }

  private static boolean isPallin(int i, int end, String s) {

    while (i<end){
      if (s.charAt(i) == s.charAt(end)){
        i++;
        end--;
      }else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    Boolean value = impl("aba");
    System.out.println(value);

  }

}
