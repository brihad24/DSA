public class Main {
    public static void main(String[] args) {
        DoubLinkList list = new DoubLinkList(); // creating an object of our linked list

        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(44);

        list.display();
    }
}
