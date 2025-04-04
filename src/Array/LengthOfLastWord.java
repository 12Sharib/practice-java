package Array;

public class LengthOfLastWord {

  private static void impl(String s) {

    String[] last = s.split(" ");

    System.out.println(last[last.length - 1].length());
  }

  public static void main(String[] args) {
    impl("   fly me   to   the moon  x");
  }

}
