package DoublyLL;

public class DoublyLinkedList {

  Node head;

  class Node {

    Node next;
    Node tail;
    Integer data;

    Node(int data) {
      this.next = null;
      this.data = data;
      this.tail = null;
    }


  }

  public static void main(String[] args) {
    DoublyLinkedList linkedList = new DoublyLinkedList();

    linkedList.addLast(1);
  }

  private void addLast(Integer data) {
    Node node = new Node(data);

    Node temp = head;

    while (temp != null) {
      temp.tail = temp;
      temp = temp.next;
    }
    temp.next = node;

  }


}
