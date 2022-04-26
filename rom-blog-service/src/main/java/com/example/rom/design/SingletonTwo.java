package com.example.rom.design;

/**
 * SingletonOne - Hungry Mode
 *
 * @author Roman Fu
 * @version 1.0
 */
public class SingletonTwo {
    private static final SingletonTwo singletonTwo = new SingletonTwo();

    private SingletonTwo() {

    }

    // @ThreadSafe
    public static SingletonTwo getInstance() {
        return singletonTwo;
    }
}
