public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList(); // creating an object of our linked list

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(0);

        list.display();
        System.out.println();

        list.insert(100, 3);
        list.display();
        System.out.println();

        System.out.println(list.deleteFirst());
        list.display();
        System.out.println();

        System.out.println(list.deleteLast());
        list.display();
        System.out.println();

        System.out.println(list.delete(2));
        list.display();
        System.out.println();
    }
}
