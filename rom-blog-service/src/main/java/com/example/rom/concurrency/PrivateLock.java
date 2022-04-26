package com.example.rom.concurrency;

/**
 * <p>Use synchronized to protect Object lock(private),
 * client can access by public method (someMethod) using synchronized (myLock). </p>
 *
 * @author Roman Fu
 * @version 1.0
 */
public class PrivateLock {
    private final Object myLock = new Object();

    void someMethod() {
        synchronized (myLock) {
            System.out.println("oh, my god!");
        }
    }
}
