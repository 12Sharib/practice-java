package LinkedList;


public class Pallindrome {
//Pending
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(1);

    linkedList.print();

    System.out.println();

    LinkedList.Node rev = reverseList(linkedList.head);
    linkedList.printUsingList(rev);

    LinkedList.Node node = linkedList.head;
    boolean isPalindrome = true;

    while (rev!=null && node !=null){
      if (node.data != rev.data){
        isPalindrome = false;
        break;
      }
      rev = rev.next;
      node = node.next;
    }
    System.out.println(isPalindrome);
  }
  private static LinkedList.Node reverseList(LinkedList.Node head){
    LinkedList.Node temp = head;

    LinkedList.Node prev = null;

    while (temp!=null){
      LinkedList.Node next = temp.next;

      temp.next = prev;
      prev = temp;

      temp = next;
    }
    return prev;
  }

}
