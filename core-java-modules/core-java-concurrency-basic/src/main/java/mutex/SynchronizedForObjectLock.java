package mutex;

public class SynchronizedForObjectLock {
    private final Object myLock = new Object();

    void someMethod() {
        synchronized (myLock) {
            System.out.println("something method...");
        }
    }
}
