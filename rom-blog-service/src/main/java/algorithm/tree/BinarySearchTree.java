package algorithm.tree;

/**
 * BinarySearchTree
 *
 * @author Roman Fu
 * @version 1.0
 */
public class BinarySearchTree {
    private Node tree;

    // find data
    public Node find(int data) {
        Node cursor = tree;  // dim cursor

        while (cursor != null) {
            if (data < cursor.data) {
              cursor = cursor.left;  // point to left
            } else if (data > cursor.data) {
                cursor = cursor.right;  // to right
            } else {
                return cursor;
            }
        }

        return null;
    }

    // insert data
    public void insert(int data) {
        if (tree == null) {
            tree = new Node(data);
            return;
        }

        Node pointer = tree;
        while (true) {
            if (data > pointer.data) {
                if (pointer.right == null) {
                    pointer.right = new Node(data);
                    return;
                }
                pointer = pointer.right;
            } else {  // data < pointer.data
                if (pointer.left == null) {
                    pointer.left = new Node(data);
                    return;
                }
                pointer = pointer.left;
            }
        }
    }


    public static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
