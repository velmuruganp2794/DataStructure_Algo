package DoublyLinkedList_Implementation;

import org.junit.Test;

public class DoublyLinkedList_Imp {

   @Test
   public void implementation(){
       DoublylinkedList list = new DoublylinkedList();
       list.add(10);
       list.add(100);
      /* list.add(1000);
       list.add(1001);*/
      // System.out.println("Size is = "+list.size());
       list.printList();
     //  System.out.println("get value "+list.get(3).value);
    //   list.set(4,100);
     //  list.printList();
       //list.remove_index(2);
       list.removeValue(100);
       list.printList();
       list.add(101);
      list.printList();
      // list.add(17);
       //list.printList();
   }
}
