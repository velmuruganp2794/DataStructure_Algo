package DoublyLinkedList_Implementation;

public class DoublylinkedList {

    Node head, tail;
    int length;


    public void add(int value){

        Node current = new Node(value);

        if(head==null){
            head = current;
            tail=head;

        } else{
            current.prev=tail;
            tail.next = current;
            tail = current;

        }
        length++;


    }

    public int size(){
        return length;

    }

    public void printList(){

        Node current = head;
        while(current!=null){
            System.out.print(current.value+" ");
            current = current.next;
        }
        System.out.println();

    }

    public Node get(int index){

        Node current = head;
        int count=1;

        while(head!=null){

            if(count==index) return current;
            current = current.next;
            count++;
        }

        return null;
    }

    public void set(int index, int value){

        Node temp = head;
        int count = 1;

        while(temp!=null){

            if(count== index){
                temp.value = value;
                break;
            }
            temp = temp.next;
            count++;


        }

    }

    public void remove_index(int index){

        Node current = head;
        int count=0;
        while(current!=null){
            if(count==index){
                if(current.prev==null){ // Head Node
                    head = head.next;
                } else if(current.next!=null) { // between head and tail
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                } else { // tail element
                    tail = current.prev;
                    current.prev.next = null;

                }
                length--;
                break;
            }
            current = current.next;
            count++;

        }

    }

    public void removeValue(int value){


        Node current = head;
        while(current!=null){

            if(current.value==value) {
                if (current.prev == null) { // Remove head
                    head = head.next;

                } else if (current.next != null) {

                    current.prev.next = current.next;
                    current.next.prev = current.prev;

                } else {
                    tail = current.prev;
                    current.prev.next = null;

                }
                length--;
                break;

            }
            current = current.next;
        }
    }

    public void removeFirstIndex(){

        if(head!=null){
            head = head.next;
            length--;
        }


    }

    public void removeLastIndex(){

        if(head!=null){
            tail = tail.prev;
            tail.next = null;
            length--;
        }
        if(tail==null){
            head = null;
        }

    }

    public void addAll(int[] values){
        for(int val:values){
            add(val);
        }
    }

    public void removeAll(int value){


        Node current = head;
        while(current!=null){

            if(current.value==value) {
                if (current.prev == null) { // Remove head
                    head = head.next;

                } else if (current.next != null) {

                    current.prev.next = current.next;
                    current.next.prev = current.prev;

                } else {
                    tail = current.prev;
                    current.prev.next = null;

                }
                length--;


            }
            current = current.next;
        }
    }

}
