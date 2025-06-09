package SlidingWindow;

public class FindTheKBeautyOfANumber {

  private static void impl(int num, int k) {

    String value = String.valueOf(num);

    int start = 0;
    int count = 0;

    while (start <= value.length() - k) {
      String ans = value.substring(start, k + start);
      int subNum = Integer.parseInt(ans);
      if (subNum != 0 && (Long.parseLong(value) % subNum == 0)) {
        count++;
      }
      start++;
    }
    System.out.println(count);

  }

  public static void main(String[] args) {
    impl(430043, 2);

  }

}
