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

    LinkedList.Node temp1 = linkedList.head;
    LinkedList.Node temp2 = linkedList1.head;

    LinkedList.Node node = new Node(-1);
    LinkedList.Node nodeHead = node;
    int carry = 0;
//   if (l1 == null) return l2;
//        if (l2 == null) return l1;
//
//        ListNode node = new ListNode(-1);
//        ListNode curr = node;
//        int carry = 0;
//
//        while (l1 != null || l2 != null) {
//            int sum = carry;
//
//            if (l1 != null) {
//                sum += l1.val;
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                sum += l2.val;
//                l2 = l2.next;
//            }
//
//            curr.next = new ListNode(sum % 10);
//            carry = sum / 10;
//
//            curr = curr.next;
//        }
//
//        if (carry > 0) {
//            curr.next = new ListNode(carry);
//        }
//
//        return node.next;
  }

}
