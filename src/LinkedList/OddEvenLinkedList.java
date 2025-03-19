package LinkedList;

public class OddEvenLinkedList {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(2);

    linkedList.print();
    System.out.println();

    if (linkedList.head ==null || linkedList.head.next ==null){
      return;
    }

    LinkedList.Node odd = linkedList.head;
    LinkedList.Node even = odd.next;
    LinkedList.Node evenHead = even;

    while (even != null && even.next != null) {
      odd.next = even.next;
      odd = odd.next;

      even.next = odd.next;

      even = even.next;
    }
    odd.next = evenHead;

    linkedList.printUsingList(linkedList.head);
  }

}
