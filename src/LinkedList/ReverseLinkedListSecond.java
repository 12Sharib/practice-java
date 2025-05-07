package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedListSecond {

  private static void impl(int left, int right) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    linkedList.addLast(4);
    linkedList.addLast(5);

    LinkedList.Node head = linkedList.head;
    if (head == null || left == right) {
      return;
    }

    List<Integer> values = new ArrayList<>();
    LinkedList.Node current = head;
    while (current != null) {
      values.add(current.data);
      current = current.next;
    }

    int i = left - 1;
    int j = right - 1;
    while (i < j) {
      int temp = values.get(i);
      values.set(i, values.get(j));
      values.set(j, temp);
      i++;
      j--;
    }

    current = head;
    int index = 0;
    while (current != null) {
      current.data = values.get(index++);
      current = current.next;
    }

  }

  public static void main(String[] args) {
    impl(2, 4);

  }

}
