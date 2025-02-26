package com.example.binary;

/**
 * Binary search tree
 *
 * @author Roman Fu
 * @version 0.5.8
 */
public class BinarySearchTree {
    private Node tree;

    /**
     * Search by Iterator
     * O(height)
     *
     * @param data Node's key
     * @return the pointer's Node
     */
    Node findByIterator(int data) {
        Node point = tree;

        while (point != null) {
            if (data < point.data)
                point = point.left;
            else if (data > point.data)
                point = point.right;
            else return point;
        }
        return null;
    }

    /**
     * Search by Recursion
     * O(height)
     */
    Node findByRecursion(Node point, int data) {
        if (point.data == data) {
            return point;
        }

        if (data < point.left.data)
            return findByRecursion(point.left, data);
        else
            return findByRecursion(point.right, data);
    }

    /**
     * Insert Node by Iterator
     *
     * @param data Node's key
     */
    public void insertNode(int data) {
        Node point = tree;

        while (point != null) {
            if (data > point.data) {
                if (point.right == null) {
                    point.right = new Node(data);
                    return;
                }
                point = point.right;
            } else {  // data < point.data
                if (point.left == null) {
                    point.left = new Node(data);
                    return;
                }
                point = point.left;
            }
        }
    }

    /**
     * delete node (three basic cases)
     *
     * @param data Node's key
     */
    public void delete(int data) {
        Node p = tree;
        Node pp = null;  // as p's parent node
        while (p != null && p.data != data) {
            pp = p;
            if (data > p.data)
                p = p.right;
            else p = p.left;
        }
        if (p == null)
            return;

        // p has two child
        if (p.left != null && p.right != null) {
            Node minP = p.right;
            Node minPP = p;
            while (minP.left != null) {
                minPP = minP;
                minP = minP.left;
            }
            p.data = minP.data;
            p = minP;
            pp = minPP;
        }

        // p has one child
        Node child;
        if (p.left != null) child = p.left;
        else if (p.right != null) child = p.right;
        else child = null;

        // p has no child
        if (pp == null) tree = child;
        else if (pp.left == p) pp.left = child;
        else pp.right = child;
    }

    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}