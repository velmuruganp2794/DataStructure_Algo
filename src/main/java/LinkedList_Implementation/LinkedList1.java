package LinkedList_Implementation;

public class LinkedList1 {

    Node head;
    Node tail;
    int length;

    //add the node to list. if list is empty, first node will be head. tail equal to head; else element need to be added to last element;
    public void add(int value){ //2
        Node tempNode = new Node(value); //sep node

    if(head==null) {
       head = tempNode;
       tail = head;
    } else{
         tail.next = tempNode;
         tail = tempNode;
    }
    length++;

    }

    // return Size of the linkedlist
    public int size(){
        return length;
    }

    // print elements
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // remove node based on index
    public void remove_Index(int index){

        if(index==1){
            head = head.next;
            length--;
            return ;
        }

        Node previous = head;
        int count=1;

        while(previous!=null ){
            if(count==index-1) {
                if(previous.next.next==null){
                    previous.next = null;
                    tail = previous;
                }
                else previous.next = previous.next.next;
                length--;
                return;
            }
            previous = previous.next;
            count++;

        }


    }

    // get based on index
    public Node get(int index){
        Node temp = head;
        int count = 1;

        while(temp!=null){

            if(count == index) return temp;
            temp = temp.next;
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

    public void removeValue(int value){

        if(head.value==value){ // Remove head
            head = head.next;
            length--;
            return;
        }

        Node previous = head;
        while(previous!=null){


            if(previous.next.next!=null && previous.next.value==value){
                previous.next=previous.next.next;
                length--;
                break;

            } else if(previous.next.next==null && previous.next.value==value){
                previous.next = null;
                tail=previous;
                length--;
                break;
            }
            previous = previous.next;
        }
    }

    public int indexOf(int value){

        Node current = head;
        int index=0;
        while(current!=null){
            if(current.value==value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public int lastIndexOf(int value){

        Node current = head;
        int index=0, lastIndex=-1;
        while(current!=null){
            if(current.value==value) lastIndex = index;
            current = current.next;
            index++;
        }
        return lastIndex;
    }

    public void removeFirstIndex(){
        if(head!=null){
            head = head.next;
            length--;
        }
    }

    public void removeLastIndex(){
        int count=1;
        Node current = head;
        while(current!=null){
            if(length==1) {
                removeFirstIndex();
                break;
            }
            if(count==length-1){
                current.next = null;
                tail = current;
                length--;
                break;
            }
            current = current.next;
            count++;

        }

    }

    public void removeAll(int value){

        if(head.value==value){ // Remove head
            head = head.next;
            length--;
        }

        Node previous = head;
        while(previous!=null){

            if(previous.next.next!=null && previous.next.value==value){
                previous.next=previous.next.next;
                length--;
            } else if(previous.next.next==null && previous.next.value==value){
                previous.next = null;
                tail=previous;
                length--;
            }
            previous = previous.next;
        }

    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
            tail = head;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

}
