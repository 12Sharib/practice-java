package Strings;

public class CountSegments {
  private static void impl(String s){
    if(s.length() == 0){
     return;
    }
    int count = 0;

    String [] arr =s.split(" ");
    for(int i=0;i<arr.length;i++){
      if(!arr[i].equals("")){
        count++;
      }
    }
    System.out.println(count);
  }

  public static void main(String[] args) {
    impl(", , , ,        a, eaefa");
  }

}
