package TwoPointers;

public class ReverseOnlyLetters {

  private static void impl(String s) {

    int start = 0;
    int end = s.length() -1;

    StringBuilder builder = new StringBuilder(s);

    while (start < end){
      char chstart = builder.charAt(start);
      char chEnd = builder.charAt(end);
      if (Character.isLetter(chstart) && Character.isLetter(chEnd)){
        builder.setCharAt(start, chEnd);
        builder.setCharAt(end, chstart);

        start++;
        end--;
      } else if (!Character.isLetter(chstart)) {
        start++;
      }else {
        end--;
      }
    }
    System.out.println(builder);

  }

  public static void main(String[] args) {
    impl("a-bC-dEf-ghIj");
  }

}
