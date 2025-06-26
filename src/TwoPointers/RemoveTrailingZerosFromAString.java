package TwoPointers;

public class RemoveTrailingZerosFromAString {

  private static void impl(String num){

    int ans = num.length();

    for(int i=num.length()-1;i>0;i--){
      if (num.charAt(i) == '0'){
        ans = i;
      }else {
        break;
      }
    }
    System.out.println(num.substring(0, ans));

  }

  public static void main(String[] args) {
    impl("51230100");
  }

}
