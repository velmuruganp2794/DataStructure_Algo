package LinkedList_Implementation;

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


}
