package LinkedList;


public class Pallindrome {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(1);

    linkedList.print();

    LinkedList.Node mid = middleOfList(linkedList.head);
    LinkedList.Node rev = reverseList(mid);
    LinkedList.Node tempRev = rev;
    LinkedList.Node temp = linkedList.head;
    boolean isPalindrome = true;

    while (tempRev != null) {
      if (temp.data != tempRev.data) {
        isPalindrome = false;
        break;
      }
      temp = temp.next;
      tempRev = tempRev.next;
    }
    System.out.println(isPalindrome);

  }

  private static LinkedList.Node middleOfList(LinkedList.Node head) {
    LinkedList.Node slow = head;
    LinkedList.Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private static LinkedList.Node reverseList(LinkedList.Node head) {
    LinkedList.Node temp = head;

    LinkedList.Node prev = null;

    while (temp != null) {
      LinkedList.Node next = temp.next;

      temp.next = prev;
      prev = temp;

      temp = next;
    }
    return prev;
  }

}
