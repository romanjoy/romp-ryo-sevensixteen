package com.example.design;

/**
 * SingletonOne - Lazy Mode
 *
 * @author Roman Fu
 * @version 1.0
 */
public class SingletonOne {
    private static volatile SingletonOne singletonOne;

    private SingletonOne() {

    }

    // @NotThreadSafe
    @Deprecated
    public static SingletonOne getInstance() {
        if (singletonOne == null) {
            singletonOne = new SingletonOne();
        }
        return singletonOne;
    }

    // @ThreadSafe  Double Check + synchronized
    public static SingletonOne getInstance2() {
        if (singletonOne == null) {
            synchronized (SingletonOne.class) {
                if (singletonOne == null) {
                    singletonOne = new SingletonOne();
                }
            }
        }
        return singletonOne;
    }
}
