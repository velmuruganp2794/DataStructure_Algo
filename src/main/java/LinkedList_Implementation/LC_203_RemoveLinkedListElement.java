package LinkedList_Implementation;

import org.junit.Test;

public class LC_203_RemoveLinkedListElement {

    @Test
    public void testdata1(){
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(4);
        list1.add(6);
        Node output = list1.head;
        removeElements_Recursion(list1.head,4);
        while (output!=null){
            System.out.print(output.value + " ");
            output = output.next;
        }
    }

    @Test
    public void testdata2(){
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(4);
        list1.add(4);
        Node output = list1.head;
        removeElements_Recursion(list1.head,4);
        while (output!=null){
            System.out.print(output.value + " ");
            output = output.next;
        }

    }

    @Test
    public void testdata3(){
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(4);
        list1.add(4);
        Node output = list1.head;
        removeElements_Recursion(list1.head,4);
        while (output!=null){
            System.out.print(output.value + " ");
            output = output.next;
        }

    }


    @Test
    public void testdata4(){
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(4);
        Node output = list1.head;
        removeElements_Recursion(list1.head,4);
        while (output!=null){
            System.out.print(output.value + " ");
            output = output.next;
        }

    }

    /* Pseudo-code
    1. Check head is not null and head value equal to value to remove. increment the head position.
    2. do the same till the values matches with given value to be removed
    3. if condition not matches assign head to previous
    4. if previous.next not equal to null, check previous.next.next not equal null and previous.next.value macthes with give value.
    5. if yes, assign previous node next to previous next next
    6. if previous .nex.next equal to null, we are going to remove tail node if value matches with given value
    7. assign previous next to null
    8. return list head
     */

    public Node removeElements(Node head, int val) {

       if(head==null) return head;

       while(head!=null && head.value==val){
           head = head.next;
       }

       Node previous = head;

       while(previous!=null  && previous.next!=null){
           if (previous.next.value == val) previous.next = previous.next.next;
           else previous = previous.next;

       }

     return head;
    }

    public void removeElements_Recursion(Node head, int val) {
        if(head!=null && head.value==val){
            head = head.next;
            removeElements_Recursion(head,val);
        }
        Node previous = head;
        if(previous!=null  && previous.next!=null){
            if (previous.next.value == val) previous.next = previous.next.next;
            else previous = previous.next;
            removeElements_Recursion(previous,val);
        }

    }
}
