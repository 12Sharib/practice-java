package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
//Pending
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(4);
    linkedList.addLast(2);
    linkedList.addLast(5);
    linkedList.addLast(3);

    linkedList.print();

//    0(n)
    LinkedList.Node temp = linkedList.head;
    List<Integer> list = new ArrayList<>();

    while (temp != null) {
      list.add(temp.data);
      temp = temp.next;
    }

    System.out.println();

    Collections.sort(list);

    LinkedList.Node node = linkedList.head;

    int i = 0;
    while (i < list.size()) {
      node.data = list.get(i);
      node = node.next;

      i++;
    }
    linkedList.print();


  }

}
