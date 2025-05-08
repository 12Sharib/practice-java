package LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DeleteDuplicates {

  private static void impl() {
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(1);
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    linkedList.addLast(3);
    linkedList.addLast(3);

    Map<Integer, Integer> set = new HashMap<>();

    linkedList.print();
    LinkedList.Node temp = linkedList.head;

    while (temp != null) {
      if (set.containsKey(temp.data)){
        set.put(temp.data, set.get(temp.data) +1);
      }else{
        set.put(temp.data, 1);
      }
      temp = temp.next;
    }
    System.out.println(set);
    temp = linkedList.head;

    LinkedList.Node isvisited = null;
    for (Map.Entry<Integer, Integer> val : set.entrySet()) {
      if (val.getValue()==1){
        temp.data = val.getKey();
        isvisited = temp;
        temp = temp.next;
      }
    }
    isvisited.next = null;
    System.out.println();


    linkedList.printUsingList(linkedList.head);


  }

  public static void main(String[] args) {
    impl();
  }

}
