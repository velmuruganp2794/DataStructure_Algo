package LinkedList_Implementation;

public class LC_160_IntersectionOfLinkedList {

    /* Pseudo-code:
    1. Find the difference between both the list length
    2. declare temp node for both the listNodes
    3. if lenthA is greater than lengthB, assign skipA equal to difference length
    4. If lengthB is greater than lengthA, assign skipB equal to difference length
    5. then traverse the both the list
    6. if listnode of A and B not equal increment skipA and SkipB
    7. if both are equal, retun that node
    8. At the end retun null node;
     */

    /*Time Complexity = O(M+N) , Space Complexity = O(N) */

    public Node getIntersectionNode(Node headA, Node headB) {

        Node tempA = headA;
        Node tempB = headB;
        Node Intersect=null;
        int skipA=0,skipB=0;

        int lengthofHeadA = length(headA);
        int lengthofHeadB = length(headB);

       while(lengthofHeadA>lengthofHeadB){
           tempA = tempA.next;
           lengthofHeadA--;
           skipA = lengthofHeadA-lengthofHeadB;
       }
        while(lengthofHeadB>lengthofHeadA){
            tempB = tempB.next;
            lengthofHeadB--;
            skipB=lengthofHeadB-lengthofHeadA;
        }

        while(tempA!=null && tempB!=null){

            if(tempA==tempB) return tempA;
            skipA++;
            skipB++;
            tempA = tempA.next;
            tempB = tempB.next;

        }


        return Intersect;

    }

    public int length(Node head){

        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
