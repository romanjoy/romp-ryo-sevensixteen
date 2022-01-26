package algorithm.tree;

import static org.apache.commons.lang3.ArrayUtils.swap;

/**
 * Heap Tree
 *
 * @author Roman Fu
 * @version 1.0
 */
public class HeapTree {
    private int[] arr;
    private int capacity;
    private int count;  // count in fact

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
        while (index / 2 > 0 && arr[index] > arr[index / 2]) {  // from bottom to top
            swap(arr, index, index / 2);
            index = index / 2;
        }
    }
}
