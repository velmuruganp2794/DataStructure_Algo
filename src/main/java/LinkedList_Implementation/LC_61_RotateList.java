package LinkedList_Implementation;

import org.junit.Test;

public class LC_61_RotateList {

    /* Pseudo-code
    1. Find the length of the linkedlist by traversing from head to last node
    2. find the k value, if k is greater than length by length%k;
    3. Find the position where we need add that node to first of the linked list
    4. After find the position assign the remaining listNode to another reference
    5. set current part of node.next to null
    6. Add the second part last element to head.
    7. reset head to remaining node reference.

     */

    @Test
    public void testdata() {
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        rotateRight(list1.head,2);

    }

    public Node rotateRight(Node head, int k) {

        Node tail = head;
        int length=1;

        while(tail.next!=null){
            length++;
            tail= tail.next;
        }
        k = k%length;

        if(k==0) return head; //No rotate needed

        Node current = head;
        for(int i=0;i<length-k-1;i++){
            current = current.next;
        }
        //Assign the remaining node to new node.
        Node newNode = current.next;
        current.next = null;
        tail.next = head;
        head = newNode;
        return head;
    }
}
