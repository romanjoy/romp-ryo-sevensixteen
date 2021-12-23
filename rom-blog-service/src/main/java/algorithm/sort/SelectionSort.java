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

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];  // dim element[0] is min
            int index = i;    // sava min's cursor

            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];  // look for min
                    index = j;    // look for min's cursor
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }

        return arr;
    }
}
