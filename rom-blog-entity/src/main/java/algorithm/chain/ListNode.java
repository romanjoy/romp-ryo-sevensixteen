package algorithm.chain;

/**
 * think palindrome in base chain
 *
 * @author Roman Fu
 * @version 1.1
 */
public class ListNode<T> {

    public ListNode<T> next;

    public T value;

    public ListNode() {
    }

    public ListNode(ListNode<T> next, T value) {
        this.next = next;
        this.value = value;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "next=" + next +
                ", value=" + value +
                '}';
    }
}
