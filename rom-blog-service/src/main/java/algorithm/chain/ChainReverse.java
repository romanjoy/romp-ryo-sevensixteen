package algorithm.chain;

/**
 * Base chain reverse
 *
 * @author Roman Fu
 * @version 1.0
 */
public class ChainReverse {
    private ChainReverse() {
        throw new IllegalStateException("Utility class");
    }

    /* V1.0: Chain forEach */
    public static String reverse(ListNode<String> node) {
        if (node == null) {
            return "";
        }
        ListNode<String> cursor = node;  // cursor forEach
        ListNode<String> revHolder = new ListNode<>();  // holder

        while (cursor != null) {
            ListNode<String> next = cursor.next;
            cursor.next = revHolder;  // point to holder (change 'cursor.next' address)
            revHolder = cursor;
            cursor = next;  // continue to forEach
        }

        return revHolder.toString();
    }

}
