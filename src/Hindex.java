public class Hindex {
  private static void impl(int []arr){

    int size = arr.length;
    int [] ans = new int[size+1];

    for (int c:arr){
      if (c>size){
        ans[size]++;
      }else {
        ans[c]++;
      }
    }
    int count = 0;
    for (int i=size;i>=0;i--){
      count+=ans[i];
      if (count >= i){
        System.out.println(i);
        break;
      }
    }

  }

  public static void main(String[] args) {
    impl(new int[]{3,0,6,1,5});
  }

}
