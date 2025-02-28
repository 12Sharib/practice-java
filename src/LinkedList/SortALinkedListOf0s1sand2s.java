package LinkedList;

import LinkedList.LinkedList.Node;

public class SortALinkedListOf0s1sand2s {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

    linkedList.addLast(0);
    linkedList.addLast(2);
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(1);
    linkedList.addLast(0);

    linkedList.print();

//    Multiple iterations
//    LinkedList.Node temp = linkedList.head;
//    int zero = 0;
//    int one = 0;
//    int two = 0;
//
//    while(temp!=null){
//      if (temp.data == 0){
//       zero++;
//      }
//      if(temp.data == 1){
//        one++;
//      }
//      if (temp.data == 2){
//        two++;
//      }
//      temp = temp.next;
//    }
//    linkedList.print();
//    LinkedList.Node temp2 = linkedList.head;
//    while (zero!=0 && temp2!=null){
//      temp2.data = 0;
//      temp2 = temp2.next;
//      zero--;
//    }while (one!=0 && temp2!=null){
//      temp2.data = 1;
//      temp2 = temp2.next;
//      one--;
//    }while (two!=0 && temp2!=null){
//      temp2.data = 2;
//      temp2 = temp2.next;
//      two--;
//    }
//    Single iteration

    LinkedList.Node temp = linkedList.head;
    LinkedList.Node zeroHead = new Node(-1);
    LinkedList.Node zero = zeroHead;

    LinkedList.Node oneHead = new Node(-1);
    LinkedList.Node one = oneHead;
    LinkedList.Node twoHead = new Node(-1);

    LinkedList.Node two = twoHead;

    while (temp != null) {
      if (temp.data == 0) {
        zero.next = temp;
        zero = temp;
      } else if (temp.data == 1) {
        one.next = temp;
        one = temp;
      } else {
        two.next = temp;
        two = temp;
      }
      temp = temp.next;
    }
    System.out.println();

    zero.next = oneHead.next;
    one.next = twoHead.next;
    two.next = null;

    linkedList.printUsingList(zeroHead.next);
  }

}
