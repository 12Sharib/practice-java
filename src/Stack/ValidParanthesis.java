package Stack;

import java.util.Stack;

public class ValidParanthesis {

  private static void impl(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {

      if (!stack.isEmpty()) {
        Character peek = stack.peek();
        if ((peek == '(' && s.charAt(i) == ')') ||
            (peek == '{' && s.charAt(i) == '}') || (
            peek == '[' && s.charAt(i) == ']')) {
          stack.pop();
          continue;
        }
      }

      stack.push(s.charAt(i));

    }
    System.out.println(stack.isEmpty());
  }

  public static void main(String[] args) {
    impl("()");

  }

}
