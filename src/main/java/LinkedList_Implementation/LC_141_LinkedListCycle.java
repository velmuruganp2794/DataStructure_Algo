package LinkedList_Implementation;

import java.util.HashSet;

public class LC_141_LinkedListCycle {

    /*Pseudo-code
    1. take two pointer
    2. slow = head, fast = head.next
    3. loop if slow not equal to fast, else return true.
    4. check if fast or fast.next equal to null return false
    5. else increment slow by 1 and fast by 2 position
     */

    /*Time Complexity - O(N), Space Complexity - O(N)*/


    public boolean hasCycle(Node head) {

        if(head==null) return false;

        Node slow = head;
        Node fast = head.next;

        while(slow!=fast){
            if(fast==null || fast.next==null) return false;
            slow = slow.next;
            fast = fast.next.next;

        }
        return true;

    }

    /*
    1. Traverse each node in linkedList
    2. add it to set if not contains in set and increment head by one position
    3. if set contains return true
    4. if head equal to null, return false.
     */

    public boolean hasCycle_usingHashMap(Node head) {

        HashSet<Node> set = new HashSet<>();

        while(head!=null){

            if(set.contains(head)) return true;
            else set.add(head);
            head = head.next;

        }
        return false;


    }


}
