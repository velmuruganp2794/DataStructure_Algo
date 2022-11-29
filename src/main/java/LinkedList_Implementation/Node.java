package LinkedList_Implementation;

public class Node {
   public int value;
    public Node next;

    public Node(){
        this.next=null;
    }

    public Node(int value){ //1
        this.value = value;
        next = null;
    }

    public Node(int value, Node temp){
        this.value = value;
        this.next = temp;
    }
}
