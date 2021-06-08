package algorithm.queue;

/**
 * Circular Queue
 *
 * @author Roman Fu
 * @version 1.0
 */
public class CircularQueue {
    private String[] items;
    private int n;  // cap

    private int head = 0;
    private int tail = 0;

    public CircularQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    // enqueue
    public boolean enqueue(String item) {
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % n;

        return true;
    }

    // dequeue
    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String ret = items[head];
        head = (head + 1) % n;

        return ret;
    }
}
