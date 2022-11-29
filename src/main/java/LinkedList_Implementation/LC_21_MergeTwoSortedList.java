package LinkedList_Implementation;

import org.junit.Test;

public class LC_21_MergeTwoSortedList {

    /*Pseudo-code
    1. Create a temp Node with zero value
    2. set Head as temp.
    2. compare head value of both the given list
    3. if list1 head value is less than list2 head value, add list1 head to temp;
    4. increment head postition of list1 list
    5. Else do the same for list2 list and increment the head
    6. Add every smaller element into temp of new list.
    7. return sortedListHead next;
     */

    /* time complexity */



    @Test
    public void testdata(){
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        LinkedList1 list2 = new LinkedList1();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        Node node = mergeTwoLists(list1.head, list2.head);

        while(node!=null){
            System.out.println(node.value);
            node = node.next;
        }


    }

    public Node mergeTwoLists(Node list1, Node list2) {
        Node temp = new Node(0);
        Node sortedListHead = temp;
        
        if(list1==null) return list2;
        if(list2==null) return  list1;

        while(list1!=null && list2!=null){

            if(list1.value<list2.value){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;

            } else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }


        }

        if(list1!=null) temp.next = list1;
        if(list2!=null) temp.next = list2;


        return sortedListHead.next;

    }

}
