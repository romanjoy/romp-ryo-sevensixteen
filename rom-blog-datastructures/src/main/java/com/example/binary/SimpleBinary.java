package com.example.binary;

/**
 * Simple Binary Search
 * O(logN)
 *
 * @author Roman Fu
 * @version 0.4.5
 */
public class SimpleBinary {

    public int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);  // better performance than (high - low)/2
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

}
