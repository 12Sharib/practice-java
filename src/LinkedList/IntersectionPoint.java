package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class IntersectionPoint {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(3);
    linkedList.addLast(2);

    LinkedList.Node node = linkedList.head;

    Map<String, Integer> map = new HashMap<>();


//    ListNode temp = headA;
//
//    Map<ListNode, Integer> map = new HashMap<>();
//
//    while(temp!=null){
//      map.put(temp, temp.val);
//      temp = temp.next;
//    }
//    ListNode tempB =headB;
//
//    while(tempB!=null){
//      if(map.containsKey(tempB)){
//        return tempB;
//      }
//      tempB = tempB.next;
//    }
//    return null;


//     ListNode temp = headA;
//
//        ListNode temp2 = headB;
//
//        if(headA == null || headB ==null){
//            return null;
//        }
//
//
//        while(temp!=temp2){
//            temp = temp.next;
//            temp2 = temp2.next;
//            if(temp == temp2){
//                return temp;
//            }
//
//            if(temp == null){
//                temp = headB;
//            }
//            if(temp2 == null){
//                temp2 = headA;
//            }
//
//        }
//        return temp;
//

  }

}
