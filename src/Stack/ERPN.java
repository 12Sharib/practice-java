package Stack;

import java.sql.Array;
import java.util.Stack;

public class ERPN {

  //  Evaluate reverse polish notation
  private static void impl(String[] tokens) {

    Stack<Integer> stack = new Stack<>();

    for (String value : tokens) {
      if (value.equals("+")) {
        stack.push(stack.pop() + stack.pop());

      } else if (value.equals("-")) {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b-a);

      } else if (value.equals("*")) {
        stack.push(stack.pop() * stack.pop());

      } else if (value.equals("/")) {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b/a);

      } else {
        stack.push(Integer.parseInt(value));
      }
    }
    System.out.println(stack);

  }

  public static void main(String[] args) {
    impl(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
  }

}
