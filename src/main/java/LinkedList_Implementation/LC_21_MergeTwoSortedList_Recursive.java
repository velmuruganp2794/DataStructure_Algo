package LinkedList_Implementation;

import org.junit.Test;

public class LC_21_MergeTwoSortedList_Recursive {


    @Test
    public void testdata(){
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList1 list2 = new LinkedList1();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(7);

        Node node = mergeTwoLists(list1.head, list2.head);

        while(node!=null){
            System.out.println(node.value);
            node = node.next;
        }

    }

    @Test
    public void testdata_Recursive(){
        LinkedList1 list1 = new LinkedList1();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList1 list2 = new LinkedList1();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(7);
        Node temp = new Node(0);
        mergeTwoLists_Recursive(temp, list1.head, list2.head);
        Node SortedList = temp.next;
        while(SortedList!=null) {
            System.out.println(SortedList.value);
            SortedList = SortedList.next;
        }

    }

    private void mergeTwoLists_Recursive(Node temp1, Node nlist1, Node nlist2) {

        if(nlist1!=null && nlist2!=null) {
            if (nlist1.value < nlist2.value) {
                temp1.next = nlist1;
                temp1 = temp1.next;
                nlist1 = nlist1.next;
            } else {
                temp1.next = nlist2;
                temp1 = temp1.next;
                nlist2 = nlist2.next;
            }

            if(nlist1==null) temp1.next = nlist2;
            else if(nlist2==null) temp1.next = nlist1;

            mergeTwoLists_Recursive(temp1, nlist1, nlist2);
        }

    }

    public Node mergeTwoLists(Node list1, Node list2) {
        Node temp = new Node(0);
        Node sortedListHead = temp;

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
            if(list1==null) temp.next = list1;
            if(list2==null) temp.next = list2;

        }
        return sortedListHead.next;

    }

}
