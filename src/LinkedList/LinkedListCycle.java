package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedListCycle {

  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(3);

    linkedList.print();

//    0(n)
    Map<LinkedList.Node, Integer> map = new HashMap<>();
    LinkedList.Node temp = linkedList.head;

    while (temp!=null){
      if (map.containsKey(temp)){
        break;
      }else{
        map.put(temp, 1);
      }
      temp = temp.next;
    }
//    0(1)
    LinkedList.Node slow = linkedList.head;
    LinkedList.Node fast = linkedList.head;

    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast){
        System.out.println("true");
      }
    }
    System.out.println("false");





  }

}
