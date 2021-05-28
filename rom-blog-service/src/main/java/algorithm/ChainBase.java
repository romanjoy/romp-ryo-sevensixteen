package algorithm;

/**
 * @author fuqiliang
 * <p>
 * Chain reverse
 */
public class ChainBase {

    /* Node Base */
    static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    /**
     * chain reverse
     *
     * @param head
     * @return
     */
    private static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head.next;
        Node newNode = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newNode;
    }

    /**
     * chain reverse
     *
     * @param node
     * @return
     */
    private static Node reverseTwo(Node node) {
        Node pre = null;
        Node next = null;

        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

//        ChainBase.reverse(node1);
        reverseTwo(node1);
        System.out.println("reverse over...");
    }
}
