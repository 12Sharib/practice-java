package BitManipulation;

public class SingleNumber {
  private static void impl(int [] nums){
    int result = 0;


    for (int i:nums){
      result ^=i;
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    impl(new int[]{4,1,2,1,2});

  }

}
