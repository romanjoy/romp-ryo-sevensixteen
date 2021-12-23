package algorithm.sort;

/**
 * Bubble sort
 *
 * @author Roman Fu
 * @version 1.0
 */
public class BubbleSort {
    private BubbleSort() {
        throw new IllegalStateException("Utility class");
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            /* equal times = element numbers - 1 */
            for (int index = 0; index < arr.length - i - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index + 1];  // need space to store
                    arr[index + 1] = arr[index];  // change array's pos
                    arr[index] = temp;
                }
            }
        }

        return arr;
    }
}
