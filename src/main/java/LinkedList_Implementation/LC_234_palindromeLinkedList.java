package LinkedList_Implementation;

import org.junit.Test;

public class LC_234_palindromeLinkedList {

    /*Pseudo - code
    1. Assign the given head to another node
    2. Create a new reverse node
    3. implement addFirst method to add it to reverse
    4. Traverse head and add each node to first in the reverse
    5. compare the actual node head1 and reverse node values
    6. if not equal return false
    7. end of the loop return true;

     */

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
          Node head1 = head;
          Node reverse=null;

          while(head!=null){
              reverse = addFirst(reverse,head.value);
              head = head.next;
          }

          while(reverse!=null && head1!=null){
              if(reverse.value != head1.value) return false;
              reverse = reverse.next;
              head1 = head1.next;
          }

         return true;
    }

    public Node addFirst(Node head , int val){

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;

    }


}
