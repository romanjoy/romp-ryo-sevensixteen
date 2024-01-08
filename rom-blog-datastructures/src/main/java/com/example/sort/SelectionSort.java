package com.example.sort;

import java.util.Arrays;

/**
 * Selection Sort
 * T(n) = O(n^2), in-place & unstable sort
 *
 * @author Roman Fu
 * @version 0.2.5
 */
public class SelectionSort {

    public int[] selectionSort(int[] arr) {
        // From left to right
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];  // as element[i] is min value
            int minIndex = i;  // save index

            // find min's value & min's index
            for (int cursor = i + 1; cursor < arr.length; cursor++) {
                if (min > arr[cursor]) {
                    min = arr[cursor];
                    minIndex = cursor;
                }
            }
            // exchange element
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {4, 7, 8, 2, 3};
        SelectionSort select = new SelectionSort();

        System.out.println(Arrays.toString(select.selectionSort(arr)));
    }
}
