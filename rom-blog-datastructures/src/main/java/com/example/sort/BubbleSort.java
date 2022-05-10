package com.example.sort;

import java.util.Arrays;

/**
 * Bubble sort
 *
 * @author Roman Fu
 * @version 1.0
 */
public class BubbleSort {

    public int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // in-place sort, equal times = array's length -1
            for (int index = 0; index < arr.length - i - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index + 1];
                    arr[index + 1] = arr[index];  // change pos
                    arr[index] = temp;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 2, 9, 1};
        BubbleSort bubble = new BubbleSort();

        System.out.println(Arrays.toString(bubble.bubbleSort(arr)));
    }
}
