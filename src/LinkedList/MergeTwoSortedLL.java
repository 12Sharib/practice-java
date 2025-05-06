package LinkedList;

import LinkedList.LinkedList.Node;

public class MergeTwoSortedLL {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(4);

    LinkedList linkedList1 = new LinkedList();
    linkedList1.addLast(1);
    linkedList1.addLast(3);
    linkedList1.addLast(4);

    linkedList.print();

    System.out.println();

    linkedList1.print();

    LinkedList.Node list1 = linkedList.head;
    LinkedList.Node list2 = linkedList1.head;

    LinkedList.Node newNode = new Node(-1);
    Node head = newNode;

    while (list1 != null && list2 != null) {
      if (list1.data < list2.data) {
        newNode.next = list1;
        list1 = list1.next;
        newNode = newNode.next;
      } else {
        newNode.next = list2;
        list2 = list2.next;
        newNode = newNode.next;
      }
    }
    while (list1 != null) {
      newNode.next = list1;
      list1 = list1.next;
      newNode = newNode.next;
    }
    while (list2 != null) {
      newNode.next = list2;
      newNode = newNode.next;
      list2 = list2.next;
    }
    linkedList.printUsingList(head.next);
  }


}
