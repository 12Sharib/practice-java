package Stack;


import java.util.Stack;

public class SimplifyPath {

  private static void impl(String path){
    Stack<String> stack = new Stack();
    
    String [] arr = path.split("/");

    for (int i=0;i< arr.length;i++){
      if (arr[i].equals("..") && !stack.isEmpty()){
        stack.pop();
      }else if (!arr[i].equals(".") && !arr[i].equals("..") && !arr[i].equals("")){
        stack.push(arr[i]);
      }
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (String string:stack){
      stringBuilder.append("/");
      stringBuilder.append(string);
    }
    if (stringBuilder.isEmpty()){
      stringBuilder.append("/");
      stringBuilder.toString();
    }else{
      stringBuilder.toString();
    }

    System.out.println(stringBuilder);
  }
  public static void main(String[] args) {
    impl("/../");
  }

}
