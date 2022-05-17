package com.example.linkedlist.reverse;

public class LinkedListReversal {

    ListNode constructLinkedList() {
        ListNode head = null;
        ListNode tail = null;

        for (int i = 1; i <= 5; i++) {
            ListNode node = new ListNode(i);
            if (head == null) {
                head = node;
            } else {
                tail.setNext(node);
            }
            tail = node;
        }
        return head;
    }

    /* Iterative Algorithm Implementation */
    ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

}
