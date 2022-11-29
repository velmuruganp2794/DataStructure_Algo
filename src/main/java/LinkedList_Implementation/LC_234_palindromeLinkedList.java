package LinkedList_Implementation;

import org.junit.Test;

public class LC_234_palindromeLinkedList {

    @Test
    public void testdata() {
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        isPalindrome(list1.head);

    }
    public boolean isPalindrome(Node head) {

        Node temp1 = new Node();
        temp1 =  reverseList(head);
        return true;

    }

    public Node reverseList(Node head) {
        Node reverse= new Node();
        while(head!=null){
            Node temp = head.next;
            head.next = reverse;
            reverse = head;
            head = temp;
        }

        return reverse;
    }
}
