package com.example.rom.algorithm.tree;

/**
 * Tree Node
 *
 * @author Roman Fu
 * @version 1.0
 */
public class TreeNode {
    int value;
    TreeNode LeftNode;  // left child
    TreeNode RightNode;  // right child

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode LeftNode) {
        this.LeftNode = LeftNode;
    }

    public void setRightNode(TreeNode RightNode) {
        this.RightNode = RightNode;
    }

    // pre-order
    public void frontShow() {
        System.out.print(value);
        if (LeftNode != null) {
            LeftNode.frontShow();
        }
        if (RightNode != null) {
            RightNode.frontShow();
        }
    }

    // in-order
    public void midShow() {
        if (LeftNode != null) {
            LeftNode.midShow();
        }
        System.out.print(value);
        if (RightNode != null) {
            RightNode.midShow();
        }
    }

    // post-order
    public void afterShow() {
        if (LeftNode != null) {
            LeftNode.afterShow();
        }
        if (RightNode != null) {
            RightNode.afterShow();
        }
        System.out.print(value);
    }
}


/*    //前序查找
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        if (this.value == i) {
            return this;
        } else {
            if (LeftNode != null) {
                target = LeftNode.frontSearch(i);
            }
            if (target != null) {
                return target;
            }
            if (RightNode != null) {
                target = RightNode.frontSearch(i);
            }
        }
        return target;
    }

    //删除一颗子树
    public void delete(int i) {
        TreeNode parent = this;
        if (parent.LeftNode != null && parent.LeftNode.value == i) {
            parent.LeftNode = null;
            return;
        }
        if (parent.RightNode != null && parent.RightNode.value == i) {
            parent.RightNode = null;
            return;
        }
        parent = LeftNode;
        if (parent != null) {
            parent.delete(i);
        }
        parent = RightNode;
        if (parent != null) {
            parent.delete(i);
        }
    }*/


/*public class BinaryTree {

    TreeNode root;

    //设置根节点
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    //返回根节点
    public TreeNode getRoot() {
        return root;
    }

    //前序遍历
    public void frontShow() {
        if (root != null) {
            root.frontShow();
        }
    }

    //中序遍历
    public void midShow() {
        if (root != null) {
            root.midShow();
        }
    }

    //后序遍历
    public void afterShow() {
        if (root != null) {
            root.afterShow();
        }
    }

    //前序查找
    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    //删除一颗子树
    public void delete(int i) {
        if (root.value == i) {
            root = null;
        } else {
            root.delete(i);
        }
    }
}*/

