package com.example.tree;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;


public class HeapTreeUnitTest {

    @Test
    public void removeMax() {
        HeapTree heap = new HeapTree(6);
        heap.insert(2);
        heap.insert(8);
        heap.insert(14);
        heap.insert(28);
        heap.insert(7);
        heap.insert(20);

        int[] arr = heap.getArr();
        System.out.println("After insert: " + ArrayUtils.toString(arr));

        heap.removeMax();
        System.out.println("After removeMax: " + ArrayUtils.toString(arr));
    }
}
