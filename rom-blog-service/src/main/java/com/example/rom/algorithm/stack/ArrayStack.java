package com.example.rom.algorithm.stack;

/**
 * Array Stack (Last In First Out)
 *
 * @author Roman Fu
 * @version 1.0
 */
public class ArrayStack {
    private String[] items;
    private int count;  // element count
    private int capacity;  // stack length

    public ArrayStack(int capacity) {
        this.items = new String[capacity];
        this.capacity = capacity;
        this.count = 0;  // init []
    }

    // push
    public boolean pushStack(String item) {
        if (count == capacity) {
            return false;
        }
        items[count] = item;
        ++count;

        return true;
    }

    // pop
    public String popStack() {
        if (count == 0) {
            return null;
        }
        String tmp = items[count - 1];
        --count;

        return tmp;
    }
}