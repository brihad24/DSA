import java.util.LinkedList;
import java.util.Queue;

public class InBuiltEx{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // since internally, java uses a linked list to implement a queue
        queue.add(34);
        queue.add(4);
        queue.add(3);
        queue.add(32);
        queue.add(6);

        System.out.println(queue.peek()); // returns the first element in the queue
        System.out.println(queue.remove()); // removes and returns the first element in the queue
        System.out.println(queue.remove());
    }
}