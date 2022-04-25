package com.example.rom.algorithm.stack;

/**
 * Chain Stack (Last In First Out)
 *
 * @author Roman Fu
 * @version 1.0
 */
public class ChainStack {
    private Element base;
    private Element top;

    static class Element {
        Object data;
        Element next;
    }

    // chain stack init
    public void init() {
        Element elem = new Element();
        base = elem;
        top = elem;
        elem.data = null;
    }

    // push
    public void push(Object obj) {
        Element element = new Element();
        element.data = obj;
        element.next = top;  // element.next save top
        top = element;  // update top
    }

    // pop
    public Object pop() {
        if (this.isEmpty()) {
            return null;
        }
        Object obj = top.data;
        top = top.next;  // update top's cursor

        return obj;
    }

    // isEmpty
    public boolean isEmpty() {
        return (base == top);
    }
}
