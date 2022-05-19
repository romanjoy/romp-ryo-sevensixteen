package publish;

import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;
import org.w3c.dom.events.EventTarget;

/**
 * <p>Publish and adding eventListener by using private constructor & static method,
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
