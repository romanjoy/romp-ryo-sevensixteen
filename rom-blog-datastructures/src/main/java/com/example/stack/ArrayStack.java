package com.example.stack;

/**
 * Create stack by Array
 *
 * @author Roman Fu
 * @version 0.1.1
 */
public class ArrayStack {
    private String[] items;
    private int count;
    private int n;  // stack's length

    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    public boolean push(String item) {
        if (count == n) return false;
        items[count] = item;
        ++count;
        return true;
    }

    public String pop() {
        if (count == 0) return null;
        String tmp = items[count - 1];
        --count;
        return tmp;
    }
}
