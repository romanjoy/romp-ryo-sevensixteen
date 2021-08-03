package algorithm.queue;

/**
 * Array Queue (First In, First Out)
 *
 * @author Roman Fu
 * @version 1.0 <br>
 * 1.1 Enqueue item to free memory by using 'Array copy', keep dequeue() in source code
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
            if (head == 0) {
                return false;
            }
            for (int i = head; i < tail; ++i) {  // array copy
                items[i - head] = items[i];
            }
            tail -= head;
            head = 0;
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
