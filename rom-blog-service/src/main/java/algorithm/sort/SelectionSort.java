package algorithm.sort;

/**
 * Selection Sort
 *
 * @author Roman Fu
 * @version 1.0
 */
public class SelectionSort {
    private SelectionSort() {
        throw new IllegalStateException("Utility class");
    }

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {  // from left to right
            int min = arr[i];  // dim element[0] is min value
            int minIndex = i;    // min's index

            for (int cursor = i + 1; cursor < arr.length; cursor++) {
                if (min > arr[cursor]) {
                    min = arr[cursor];
                    minIndex = cursor;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;  // exchange
        }

        return arr;
    }
}
