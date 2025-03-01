package LinkedList;

import LinkedList.LinkedList.Node;

public class AddOneInLL {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(9);
//    linkedList.addLast(2);
//    linkedList.addLast(3);

    linkedList.print();

    LinkedList.Node rev = reverseList(linkedList.head);

    System.out.println();

    LinkedList.Node revList = rev;
    int carry = 1;
    while (rev!=null){
      rev.data += carry;
      if (rev.data < 10){
        carry = 0;
        break;
      }else {
        rev.data = 0;
        carry=1;
      }
      rev = rev.next;
    }
    if (carry != 0){
      Node node = new Node(1);
      node.next = revList;

      linkedList.printUsingList(node);
    }
    linkedList.printUsingList(revList);



  }
  private static LinkedList.Node reverseList(LinkedList.Node head){
    LinkedList.Node temp = head;

    LinkedList.Node prev = null;

    while(temp!=null){
      LinkedList.Node next = temp.next;

      temp.next = prev;
      prev = temp;

      temp = next;
    }
    return prev;

  }

}
