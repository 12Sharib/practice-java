package Strings;

public class LicenseKeyFormatting {

  private static void impl(String ques, Integer k) {
    String s = ques.replaceAll("-", "");
    int firstGrp = s.length() % k;
    int i;

    StringBuilder stringBuilder = new StringBuilder();

    if (firstGrp != 0) {
      stringBuilder.append(s.substring(0, firstGrp));
    }
    i=firstGrp;

    while (i<s.length()){
      if (stringBuilder.length() >0){
        stringBuilder.append("-");
      }
      stringBuilder.append(s.substring(i, i+k));
      i = i+k;
    }
    System.out.println(stringBuilder);
  }

  public static void main(String[] args) {
    impl("5F3Z-2e-9-w", 4);
  }

}
