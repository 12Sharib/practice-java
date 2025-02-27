package LinkedList;

public class DeletetheMiddleNodeofaLinkedList {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    linkedList.addLast(4);
    linkedList.addLast(5);

    linkedList.print();

    LinkedList.Node slow = linkedList.head;
    LinkedList.Node fast = linkedList.head;

    while (fast!=null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    LinkedList.Node temp = linkedList.head;
    while (temp!=null && temp.next != null){
      LinkedList.Node next = temp.next;

      if (slow == next){
        temp.next = temp.next.next;
      }
      temp = temp.next;
    }
    linkedList.print();
  }

}
