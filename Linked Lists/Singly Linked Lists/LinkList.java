public class LinkList{

    // private so that no other function or class can alter the structure of the linked list
    private Node head; // head of linked list
    private Node tail; // tail of linked list

    private int size; // size of linked list

    public LinkList() { // since we alter the size as we insert or delete the nodes in the linked list
        this.size = 0;
    }

    public void insertFirst(int val){ // public since we need to access the function to insert elements
        Node node = new Node(val);
        node.next = head;
        head = node; // since we are inserting at the beginning, this node will always be the head

        if(tail == null){ // this is only true if there is only one element in the list
            tail = head;
        }

        size += 1; // at the end of this function, the linked list would have one more node than before, hence the size increases by one
    }

    public void insertLast(int val){
        if (tail == null){ // if tail is null, i.e. the list is empty
            insertFirst(val); // therefore, we just add it in the first place
            return;
        }

        Node node = new Node(val); // creating a new node, but it is not connected yet
        tail.next = node; // connecting the above created node to the tail node
        tail = node; // shifting the tail node to the current node as it is the last node now
        size++; // increasing size since we have just added an element
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next; // we use this to reach the node previous to index given in the function
        }

        Node node = new Node(val, temp.next); // we use this to call the constructor to create a new node, and point this node to the original node at the index
        // refer to insertion notes for visual explanation
        temp.next = node; //pointing the index-1 node to our newly created node

        size++; // since we just added another node
    }

    public void display(){ // public since we need to access the function to display the linked list
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next; // shifting head from first node to first+1 node
        if (head == null){
            tail = null;
        }

        size--; // since we just removed a node
        return val; // so that we know what node we deleted
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node = head; // starting at the first node
        while(node != null){ // searching in the list till we hit the tail
            if(node.value == value){  // if we find the value, return the node
                return node;
            }
            node = node.next; // keep going forward till we find the node
        }
        return null;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size-2); // we are now pointing to the 2nd last
        int val = tail.value;
        tail = secondLast; // pointing tail to the secondLast node
        tail.next = null; // we cut the link between the secondLast node and last node

        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1); // reaching till the index-1 node
        int val = prev.next.value;
        prev.next = prev.next.next; // pointing index-1 node to index + 1 node

        return val;
    }

    private class Node{ // private so that no other function or class can alter the structure of the linked list
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