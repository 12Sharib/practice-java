package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class FindLengthOfLoop {

  public static void main(String[] args) {
//    0(n)
    LinkedList linkedList = new LinkedList();
    LinkedList.Node temp = linkedList.head;
    Map<LinkedList.Node, Integer> map = new HashMap<>();
    int i = 0;
    while (temp != null) {
      if (map.containsKey(temp)) {
        int value = map.get(temp);
        System.out.println(i - value);
      } else {
        map.put(temp, i);
      }
      i++;
      temp = temp.next;
    }
//    0(1)
    LinkedList.Node slow = linkedList.head;
    LinkedList.Node fast = linkedList.head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next;

      if (slow == fast) {
        int j = 1;
        fast = fast.next;
        while (fast != slow) {
          fast = fast.next;
          i++;
        }
        System.out.println(j);
      }
    }

  }

}
