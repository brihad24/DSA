public class DoubLinkList{

    Node head; // default will be null
    // Node tail;

    public void insertFirst(int val){
        Node node = new Node(val); // creating a new node
        node.next = head; // pointing node to the previous head
        node.prev = null; // since no node exists before this node
        if(head != null){ // if this node is the first in LL
            head.prev = node; // making the previous head to point to the new head too (since double LL)
        }
        head = node;
    }

    public void insertLast(int val){
        if (head == null){ // if tail is null, i.e. the list is empty
            insertFirst(val); // therefore, we just add it in the first place
            return;
        }

        Node node = new Node(val); // creating a new node, but it is not connected yet
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
        // refer to insertion.md for detailed explanation
    }

    public void display(){ // public since we need to access the function to display the linked list
        Node temp = head;
        Node last = null;

        while (temp != null){
            System.out.print(temp.val + " <--> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");
        while (last != null){
            System.out.print(last.val + " <--> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    private class Node { // structure of the node
        int val ;
        Node next;
        Node prev;

        public Node(int val){ // value of the node
            this.val= val;
        }

        public Node(int val, Node next, Node prev){ // to alter the node's properties
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}