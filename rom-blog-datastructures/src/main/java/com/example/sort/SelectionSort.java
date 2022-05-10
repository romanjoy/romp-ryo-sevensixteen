package com.example.sort;

import java.util.Arrays;

/**
 * Selection Sort
 *
 * @author Roman Fu
 * @version 1.0
 */
public class SelectionSort {

    public int[] sort(int[] arr) {

        // from left to right
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];  // if element[0] is min value
            int minIndex = i;  // save min's index

            // find min's value & min index
            for (int cursor = i + 1; cursor < arr.length; cursor++) {
                if (min > arr[cursor]) {
                    min = arr[cursor];
                    minIndex = cursor;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;  // change pos
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 2, 9, 1};
        SelectionSort select = new SelectionSort();

        System.out.println(Arrays.toString(select.sort(arr)));
    }
}
