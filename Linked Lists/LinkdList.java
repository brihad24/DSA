public class LinkdList{

    private Node head;
    private Node tail;

    private int size;
    public LinkdList() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}