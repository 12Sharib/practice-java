package LinkedList;

public class PartitionList {
  private static void impl(int k){
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(4);
    linkedList.addLast(3);
    linkedList.addLast(2);
    linkedList.addLast(5);
    linkedList.addLast(2);

    LinkedList.Node slow = linkedList.head;
    LinkedList.Node fast = linkedList.head;

//    if(head == null){
//      return head;
//    }
//    ListNode less = new ListNode(-1);
//    ListNode headLess = less;
//
//    ListNode great = new ListNode(-1);
//    ListNode greatHead = great;
//
//
//    while(head!=null){
//      if(head.val < x){
//        less.next = new ListNode(head.val);
//        less = less.next;
//      }else{
//        great.next = new ListNode(head.val);
//        great = great.next;
//      }
//      head = head.next;
//    }
//    less.next = greatHead.next;
//
//    return headLess.next;


  }

  public static void main(String[] args) {
    impl(3);

  }

}
