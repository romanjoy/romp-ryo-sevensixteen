package com.example.sort;

import java.util.Arrays;

/**
 * Insertion Sort <br>
 * T(n) = O(n^2), in-place & stable sort
 *
 * @author Roman Fu
 * @version 0.2.4
 */
public class InsertSort {

    public int[] insertSort(int[] arr) {
        // From second index to sort element
        for (int i = 1; i < arr.length; i++) {
            // Compare current with left side elements
            for (int index = i; index > 0; index--) {
                if (arr[index] < arr[index - 1]) {
                    int temp = arr[index - 1];
                    arr[index - 1] = arr[index];  // exchange
                    arr[index] = temp;
                } else {
                    break;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 2, 9, 1};
        InsertSort insert = new InsertSort();

        System.out.println(Arrays.toString(insert.insertSort(arr)));
    }
}
