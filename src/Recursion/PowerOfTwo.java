package Recursion;

public class PowerOfTwo {
  private boolean isPower(long i, int n){
    if (i==n){
      return true;
    }
    if (i>n){
      return false;
    }
    if(i==0 && n==1){
      return true;
    }
    i *= 2;
    return isPower(i, n);
  }

  public static void main(String[] args) {
    PowerOfTwo powerOfTwo = new PowerOfTwo();
    Boolean value = powerOfTwo.isPower(1, 1073741825);
    System.out.println(value);

  }

}
