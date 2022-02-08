package concurrency;

import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;
import org.w3c.dom.events.EventTarget;

/**
 * Publish and add eventListener by using private constructor & static method,<br>
 * which can prevent escaping "this".
 *
 * @author Roman Fu
 * @version 1.0
 */
public class SafeListener {
    private final EventListener listener;

    private SafeListener() {
        // final listener initialized in constructor
        listener = new EventListener() {
            @Override
            public void handleEvent(Event evt) {
                // do something
            }
        };
    }

    public static void newInstance(EventTarget target) {
        SafeListener safe = new SafeListener();
        target.addEventListener("demo", safe.listener, true);
    }
}
