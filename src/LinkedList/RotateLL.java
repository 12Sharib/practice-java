package LinkedList;

import LinkedList.LinkedList.Node;

public class RotateLL {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    linkedList.addLast(4);
    linkedList.addLast(5);

    int k = 2;

    int length = 1;
    LinkedList.Node temp = linkedList.head;
    while (temp.next != null) {
      length++;
      temp = temp.next;
    }
    System.out.println(length);

    if (k % length == 0) {
      return;
    }
    k = k % length;

    Node lastNode = linkedList.head;
    for (int i = 1; i < length - k; i++) {
      lastNode = lastNode.next;
    }

    Node newHead = lastNode.next;
    lastNode.next = null;
    temp.next = linkedList.head;
    linkedList.head = newHead;

    linkedList.printUsingList(newHead);
  }


}
