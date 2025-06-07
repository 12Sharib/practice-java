package Math;

public class FactorialTrailingZeroes {
  public static void main(String[] args) {
    int count = 0;
    int n=30;

    for(int i=5;n/i >=1;i = i*5){
      count += n/i;
    }
    System.out.println(count);
  }

}
