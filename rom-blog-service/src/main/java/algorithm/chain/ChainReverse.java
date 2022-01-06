package algorithm.chain;

/**
 * Base chain reverse
 *
 * @author Roman Fu
 * @version 1.0 Chain forEach <br>
 * 1.1 Chain Recursion Formula
 */
public class ChainReverse {
    private ChainReverse() {
        throw new IllegalStateException("Utility class");
    }

    /* V1.0: Chain forEach */
    public static ListNode<String> reverse(ListNode<String> node) {
        if (node == null) {
            return null;
        }
        ListNode<String> cursor = node;  // cursor
        ListNode<String> revHolder = new ListNode<>();  // holder

        while (cursor != null) {
            ListNode<String> next = cursor.next;
            cursor.next = revHolder;  // change address of cursor's next
            revHolder = cursor;  // re-save holder (change address of holder)
            cursor = next;  // save next for next forEach
        }

        return revHolder;
    }


    /* V1.1: Chain Recursion */
    /* V1.1.1: update cursor's point, node structure */
    public static ListNode<String> reverseByRec(ListNode<String> node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode<String> newNode = reverseByRec(node.next);
        node.next.next = node;  // change pointer of node
        node.next = null;  // prevent stackoverflow to set next null

        return newNode;
    }
}
