package com.example.search;

/**
 * Simple Binary Search
 *
 * @author Roman Fu
 * @version 1.0
 * @reference simpleBinary.gif
 */
public class SimpleBinary {

    public int binary(int[] arr, int length, int value) {
        int low = 0;
        int high = length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (arr[middle] < value) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }
}
