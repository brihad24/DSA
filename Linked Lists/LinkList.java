public class LinkList{

    private Node head; // head of linked list
    private Node tail; // tail of linked list

    private int size; // size of linked list
    public LinkList() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node; // since we are inserting at the beginning, this node will always be the head

        if(tail == null){ // this is only true if there is only one element in the list
            tail = head;
        }

        size += 1; // at the end of this function, the linked list would have one more node than before, hence the size increases by one
    }

    private class Node{
        private int value; // linked list value
        private Node next; // pointing to next node

        public Node(int value){ // this is for tail since its not pointing to any other node
            this.value = value;
        }

        public Node(int value, Node next){ // this is for head or other nodes in the linked list, since it is pointing to another node
            this.value = value;
            this.next = next;
        }
    }
}