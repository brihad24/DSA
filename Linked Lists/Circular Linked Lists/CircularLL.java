public class CircularLL{
    private Node head;
    private Node tail;

    public CircularLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int val){
        Node currNode = head;
        if(currNode == null){
            return;
        }

        if(currNode.val == val){
            head = head.next;
            tail.next = head.next;
        }

        do{
            Node n = currNode.next;
            if(n.val == val){
                currNode.next = n.next;
                break;
            }
            currNode = currNode.next;
        }while(currNode != head);
    }

    public void display(){
        Node node = head;
        if(node != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while(node != head);
            System.out.println("Head");
        }
    }

    private class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}