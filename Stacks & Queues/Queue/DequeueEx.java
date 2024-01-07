import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueEx{
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(90);
        deque.add(88);

        deque.removeFirst(); // removes first element in dequeue
        deque.removeLast(); // removes last element in dequeue
    }
}