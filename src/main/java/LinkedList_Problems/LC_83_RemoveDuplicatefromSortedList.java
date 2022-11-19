package LinkedList_Problems;

public class LC_83_RemoveDuplicatefromSortedList {
    /* Pseudo code
    1. Traverse from head in LinkedList
    2. When head not equal to null, compare head and head.next
    3. if both are equal, assign head.next.next to head.next
    4. else increment head position (head = head.next)
    5. do the same till head equal null.


     */
    /* Time Complexity - O(N), Space Complexity = O(N) */

    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;

        while(head!=null && head.next!=null){

            if(head.val ==head.next.val){
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }


        return temp;
    }


}

