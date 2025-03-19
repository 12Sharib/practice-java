package Sorting;


public class LinkedLis {
  Node head;

  class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    LinkedLis linkedList = new LinkedLis();
    linkedList.addLast(3);
    linkedList.addLast(5);

    linkedList.print();
  }

  private void print() {
    Node temp = head;
    while (temp!=null){
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
  }

  private void addLast(int data) {
    Node node = new Node(data);

    if (head == null){
      head = node;
      return;
    }
    Node temp = head;
    while (temp.next!=null){
      temp = temp.next;
    }
    temp.next = node;
  }
}
