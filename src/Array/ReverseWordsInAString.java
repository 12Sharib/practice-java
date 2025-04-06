package Array;

public class ReverseWordsInAString {

  private static void impl(String string) {

    String[] arr = string.split(" +");

    StringBuilder stringBuilder = new StringBuilder();

    for (int i = arr.length - 1; i > 0; i--) {
      stringBuilder.append(arr[i]);
      stringBuilder.append(" ");
    }
    stringBuilder.append(arr[0]);
    System.out.println(stringBuilder.toString().trim());
  }

  public static void main(String[] args) {
    impl("a good   example");
  }

}
