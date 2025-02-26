package LinkedList;

import LinkedList.LinkedList.Node;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ListModel;

public class LinkedListCycleII {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(3);

    linkedList.print();
    LinkedList.Node temp = linkedList.head;

    Map<Node, Integer> map = new HashMap<>();

//  0(n)
    while(temp!=null){
      System.out.println(map.get(temp));
      if(map.containsKey(temp)){
        System.out.println(map.get(temp));
      }else{
        map.put(temp, 1);
      }
      temp = temp.next;
    }
    System.out.println("null");

//    0(1)
    LinkedList.Node slow = linkedList.head;
    LinkedList.Node fast = linkedList.head;

    while (fast!=null && fast.next !=null){
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast){
        slow = linkedList.head;
        while (slow!=fast){
          slow = slow.next;
          fast = fast.next;
        }
        System.out.println(true);
      }
    }
    System.out.println(fast);
  }

}
