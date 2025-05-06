package LinkedList;

import LinkedList.LinkedList.Node;

public class AddTwoInLL {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(2);
    linkedList.addLast(4);
    linkedList.addLast(3);

    LinkedList linkedList1 = new LinkedList();
    linkedList1.addLast(9);
    linkedList1.addLast(6);
    linkedList1.addLast(4);

    linkedList.print();

    System.out.println();

    linkedList1.print();

    Node l1 = linkedList.head;
    Node l2 = linkedList1.head;

    Node node = new Node(-1);

    Node curr = node;
    int carry = 0;

    while (l1 != null || l2 != null) {
      int sum = carry;

      if (l1!=null){
        sum += l1.data;
        l1 = l1.next;
      }
      if (l2!=null){
        sum+=l2.data;
        l2 = l2.next;
      }
      curr.next = new Node(sum%10);
      carry = sum/10;

      curr = curr.next;
    }
    if (carry > 0){
      curr.next = new Node(carry);
    }
    System.out.println();
    linkedList.printUsingList(node.next);
  }

}
