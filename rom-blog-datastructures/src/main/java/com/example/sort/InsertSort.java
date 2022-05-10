package com.example.sort;

import java.util.Arrays;

/**
 * Insertion Sort
 *
 * @author Roman Fu
 * @version 1.0
 */
public class InsertSort {

    public int[] sort(int[] arr) {
        // equal times = from second element to arr.length
        for (int i = 1; i < arr.length; i++) {

            // element[index] equals from right to left
            for (int index = i; index > 0; index--) {
                if (arr[index] < arr[index - 1]) {
                    int temp = arr[index - 1];
                    arr[index - 1] = arr[index];
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

        System.out.println(Arrays.toString(insert.sort(arr)));
    }
}
