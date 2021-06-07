package algorithm.chain;

/**
 * think palindrome in base chain
 *
 * @author Roman Fu
 * @version 1.0
 */
public class Palindrome {
    private Palindrome() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isPalindrome(ListNode<String> node) {
        if (node == null || node.next == null) {
            return true;
        }
        ListNode<String> slow = node;  // slow cursor
        ListNode<String> fast = node;  // fast cursor
        ListNode<String> pre = new ListNode<>();   // previous node

        while (fast != null && fast.next != null) {
            fast = fast.next.next;  // step 2
            ListNode<String> next = slow.next;  // step 1
            slow.next = pre;
            pre = slow;
            slow = next;  // continue
        }

        if (fast != null) {  // to determine its parity
            slow = slow.next;
        }

        while (slow != null) {
            if (!slow.value.equals(pre.value)) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }

}