package LinkedList;

public class LinkedList {

  Node head;

  public void printUsingList(Node middleNext) {
    while (middleNext != null) {
      System.out.print(middleNext.data + " -> ");
      middleNext = middleNext.next;
    }
  }

  // Self defined datatype
  public static class Node {

    int data;
    Node next;

    Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  void addFirst(int data) {
    Node node = new Node(data);
    if (head == null) {
      head = node;
      return;
    }
    node.next = head;
    head = node;
  }

  void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
  }

  void delete(int data) {
    Node temp = head;
    while (temp.next != null) {
      if (temp.next.data == data) {
        temp.next = temp.next.next;
      }
      temp = temp.next;
    }
  }

  public static void main(String[] args) {

    LinkedList ll = new LinkedList();

    // Add First
    ll.addFirst(3);
    ll.addFirst(5);
    ll.addFirst(7);

    // Add Last
    ll.addLast(8);
    ll.addFirst(0);
    ll.addLast(10);

    // Delete any data
    ll.delete(5);

    // Print List
    ll.print();
    System.out.println();

    // Delte Last
    ll.deleteLast();

    ll.print();

  }

  void deleteLast() {
    if (head == null){
      return;
    }
    Node temp = head;
    while(temp.next.next != null){
      temp = temp.next;
    }
    temp.next=null;
  }

  void addLast(int data) {
    Node node = new Node(data);

    if (head == null) {
      head = node;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = node;
  }


}
