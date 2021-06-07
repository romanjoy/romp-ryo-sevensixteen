package algorithm.stack;

/**
 * Chain Stack
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
        element.next = top;
        top = element;  // update top cursor
    }

    // pop
    public Object pop() {
        if (this.isEmpty()) {
            return null;
        }
        Object obj = top.data;
        top = top.next;

        return obj;
    }

    // isEmpty
    public boolean isEmpty() {
        return (base == top);
    }
}
