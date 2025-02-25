package LinkedList;

public class ReverseList {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    linkedList.addLast(4);
    linkedList.addLast(5);

    linkedList.print();

    reverseList(linkedList);
  }

  private static void reverseList(LinkedList linkedList) {
    LinkedList.Node prev = null;
    LinkedList.Node temp = linkedList.head;
    LinkedList.Node next = linkedList.head;

    while (temp!=null){
      next  = temp.next;

      temp.next = prev;
      prev = temp;

      temp = next;
    }

    System.out.println();
    linkedList.printUsingList(prev);
  }
}
