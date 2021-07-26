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
            cursor.next = revHolder;  // point to holder (change address of cursor.next)
            revHolder = cursor;  // save cursor
            cursor = next;  // continue to forEach
        }

        return revHolder;
    }


    /* V1.1: Chain Recursion */
    public static ListNode<String> reverseByRec(ListNode<String> node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode<String> temp = node.next;
        ListNode<String> newNode = reverseByRec(node.next);
        temp.next = node;
        node.next = null;

        return newNode;
    }
}
