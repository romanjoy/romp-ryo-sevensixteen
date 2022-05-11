package com.example.tree;

import static org.apache.commons.lang3.ArrayUtils.swap;

/**
 * Heap Tree
 *
 * @author Roman Fu
 * @version 1.0
 */
public class HeapTree {
    private final int[] arr;
    private final int capacity;
    private int count;

    public HeapTree(int capacity) {
        arr = new int[capacity + 1];
        this.capacity = capacity;
        count = 0;
    }

    public void insert(int data) {
        if (count >= capacity)
            return;  // full heap
        ++count;
        arr[count] = data;

        int index = count;
        while (index / 2 > 0 && arr[index] > arr[index / 2]) {  // from bottom to top (Max Heap)
            swap(arr, index, index / 2);  // chang pos to parent's index
            index = index / 2;
        }
    }

    public void removeMax() {
        if (count == 0)
            return;
        arr[1] = arr[count];
        --count;
        heapify(arr, count, 1);  // Max Heap as example
    }

    private void heapify(int[] arr, int count, int topIndex) {
        while (true) {
            int maxPos = topIndex;
            if (topIndex * 2 <= count && arr[topIndex] < arr[topIndex * 2]) {
                maxPos = topIndex * 2;  // from top to bottom
            }
            if (topIndex * 2 + 1 <= count && arr[maxPos] < arr[topIndex * 2 + 1]) {
                maxPos = topIndex * 2 + 1;
            }
            if (maxPos == topIndex) break;
            swap(arr, topIndex, maxPos);
            topIndex = maxPos;
        }
    }

    public int[] getArr() {
        return arr;
    }
}
