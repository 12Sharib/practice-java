package LinkedList;

public class RemoveNthNodeFromEndofList {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

    linkedList.addLast(1);
    linkedList.addLast(2);
//    linkedList.addLast(3);
//    linkedList.addLast(4);
//    linkedList.addLast(5);

    linkedList.print();
    int n = 2;
// 0(n)
//    int count = countListLength(linkedList.head);
//    System.out.println(count);
//    LinkedList.Node temp = linkedList.head;
//    int result = count-n;
//    int i=1;
//    while (temp != null) {
//      if (result == i) {
//        temp.next = temp.next.next;
//      }
//      i++;
//      temp = temp.next;
//    }
//    System.out.println();
//    linkedList.print();

//    (1)
    LinkedList.Node fast = linkedList.head;;
    for (int j=0;j<n;j++){
      fast = fast.next;
    }
    LinkedList.Node slow = linkedList.head;

    while (fast !=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = fast;
    linkedList.print();
  }

  private static int countListLength(LinkedList.Node head) {
    LinkedList.Node temp = head;
    int count = 0;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

}
