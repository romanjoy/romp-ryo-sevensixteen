package com.example.rom.algorithm.sort;

/**
 * MergeSort sort
 *
 * @author Roman Fu
 * @version 1.0
 */
public class MergeSort {
    /* print array */
    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    /*  */
    static void merge() {

    }

    /* Main function sorts by recursive */
    void sort(int[] arr, int left, int right) {
        if (left < right) {
            // Find middle point
            int m = (left + right) / 2;

            // Sort first & second halves
            sort(arr, left, m);
            sort(arr, m + 1, right);

            merge(); // todo
        }
    }


    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 2, 4, 1, 6};
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        printArray(arr);
    }

    /* mergeSort pre version */
    static void mergeSort(int[] arr, int start, int end) {
        if (end - start > 0) {
            mergeSort(arr, start, (start + end) / 2);
            mergeSort(arr, (start + end) / 2 + 1, end);

            int left = start;  // begin
            int right = (start + end) / 2 + 1;
            int index = 0;
            int[] result = new int[end - start + 1];  // build new array

            //
            while (left <= (start + end) / 2 && right <= end) {
                if (arr[left] <= arr[right]) {
                    result[index] = arr[left];
                    left++;
                } else {
                    result[index] = arr[right];
                    right++;
                }
                index++;
            }

            //
            while (left <= (start + end) / 2 || right <= end) {
                if (left <= (start + end) / 2) {
                    result[index] = arr[left];
                    left++;
                } else {
                    result[index] = arr[right];
                    right++;
                }
                index++;
            }

            for (int i = start; i <= end; i++) {
                arr[i] = result[i - start];  // rebuild new array
            }
        }
    }

}
