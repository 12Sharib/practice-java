package LinkedList;

public class MiddleOfTheList {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addFirst(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    linkedList.addLast(4);
    linkedList.addLast(5);

    linkedList.print();

    System.out.println();

    // Delete Middle Element
    deleteMiddle(linkedList);
  }

  private static void deleteMiddle(LinkedList linkedList) {
    LinkedList.Node slow = linkedList.head;
    LinkedList.Node fast = linkedList.head;

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    linkedList.printUsingList(slow);
  }

}
