package algorithm.sort;

/**
 * Base chain reverse
 *
 * @author Roman Fu
 * @version 1.0 Bubble sort <br>
 */
public class BubbleSort {
    private BubbleSort() {
        throw new IllegalStateException("Utility class");
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {  // forEach array's length

            for (int index = 0; index < arr.length - i - 1; index++) {  /* equal times = element numbers - 1 */
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index + 1];
                    arr[index + 1] = arr[index];  // change array's position
                    arr[index] = temp;
                }
            }
        }

        return arr;
    }
}
