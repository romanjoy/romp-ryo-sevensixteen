package com.example.linkedlist.reverse;

import org.junit.Test;


public class LinkedListReversalUnitTest {

    @Test
    public void reversalByIterator() {
        LinkedListReversal reversal = new LinkedListReversal();
        ListNode listNode = reversal.constructLinkedList();

        ListNode listNode1 = reversal.reverseList(listNode);
        System.out.println(listNode1);
    }

}
