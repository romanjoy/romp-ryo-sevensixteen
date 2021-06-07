package algorithm.queue;

/**
 * Array Queue
 *
 * @author Roman Fu
 * @version 1.0
 */
public class ArrayQueue {
    private String[] items;
    private int capacity = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int cap) {
        items = new String[cap];
        capacity = cap;
    }

    // enqueue
    public boolean enqueue(String item) {
        if (tail == capacity) {  // full queue
            return false;
        }
        items[tail] = item;
        ++tail;

        return true;
    }

    // dequeue
    public String dequeue() {
        if (head == tail) {  // empty queue
            return null;
        }
        String item = items[head];
        ++head;

        return item;
    }
}
