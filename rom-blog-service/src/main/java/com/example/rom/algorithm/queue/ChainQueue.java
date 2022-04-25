package com.example.rom.algorithm.queue;

/**
 * Chain Queue (First In, First Out)
 *
 * @author Roman Fu
 * @version 1.0
 */
public class ChainQueue {
    private Element head;
    private Element tail;

    static class Element {
        Object data;
        Element next;

        public Object getObj() {
            return data;
        }
    }

    // enqueue
    public void enqueue(Object obj) {
        Element element = new Element();
        element.data = obj;

        if (tail == null) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;
        }
    }

    // dequeue
    public Object dequeue() {
        if (head == null) {
            return null;
        }

        Object value = head.getObj();
        head = head.next;
        if (head == null) {
            tail = head;
        }
        return value;
    }
}
