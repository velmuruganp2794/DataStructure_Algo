package LinkedList_Implementation;

import org.junit.Test;

public class LC_206_ReverseLinkedList {
    /*Pseudo-code
    1. Declare reverse Node
    2. traverse given Node if not null
    3. inside loop declare temp = head.next
    4. head.next = reverse
    5. reverse = head;
    6. head = teamp;

     */

    /* Time Complexity = O(N), Space Complexity = O(N) */

    @Test
    public void testdata1(){
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        Node output =  reverseList_recur(list1.head);
        while (output!=null){
            System.out.print(output.value + " ");
            output = output.next;
        }
    }

    public Node reverseList(Node head) {
        Node reverse= null;
        while(head!=null){
            Node temp = head.next;
            head.next = reverse;
            reverse = head;
            head = temp;
        }
        return reverse;
    }

    public Node reverseList_recur(Node head1){
        Node reverse = null;
        return reverseList_Recursion(head1,reverse);

    }
    public Node reverseList_Recursion(Node head, Node reverse) {
       if(head==null) return reverse;

       Node temp = head.next;
       head.next = reverse;
       reverse = head;
       head = temp;
       return reverseList_Recursion(head, reverse);



    }


}
