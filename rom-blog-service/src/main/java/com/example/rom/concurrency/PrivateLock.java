package concurrency;

/**
 * Use synchronized to protect Object lock(private),<br>
 * client can access by public method (someMethod) using synchronized (myLock).
 *
 * @author Roman Fu
 * @version 1.0
 */
public class PrivateLock {
    private final Object myLock = new Object();

    void someMethod() {
        synchronized (myLock) {
            // do something
        }
    }
}
