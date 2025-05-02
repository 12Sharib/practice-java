package Stack;


public class Implementation {

  static class Stack {

    int top = -1;
    //    ArrayList<Integer> list;
    int size;
    int[] arr;

    Stack(int size) {
      this.size = size;
      arr = new int[size];
    }

    void pop() {
      if (top == -1) {
        System.out.println("Empty");
        return;
      }
      top--;
    }

    void push(int data) {
      if (top == size - 1) {
        System.out.println("Full");
        return;
      } else {
        top++;
        arr[top] = data;
      }
    }

    int peek() {
      return arr[top];
    }

    int size() {
      return top + 1;
    }

  }

  private static void impl() {
    Stack stack = new Stack(3);
    stack.push(3);
    stack.push(5);
    stack.push(4);
    while (stack.size()!=0){
      System.out.println(stack.peek());
      stack.pop();
    }


  }

  public static void main(String[] args) {
    impl();

  }

}
