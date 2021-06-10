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

        for (int i = 0; i < arr.length; i++) {  // forEach array's length
            int min = arr[i];  // default first is min
            int index = i;  // sava min's index

            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];  // find min value
                    index = j;  // find min's index
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }

        return arr;
    }
}
