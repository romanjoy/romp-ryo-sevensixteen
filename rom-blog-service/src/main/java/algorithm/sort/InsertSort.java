package algorithm.sort;

/**
 * Insert Sort
 *
 * @author Roman Fu
 * @version 1.0
 */
public class InsertSort {
    private InsertSort() {
        throw new IllegalStateException("Utility class");
    }

    public static int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {  // forEach (array's length -1)

            /* cursor from right to left, un-sort list equals with sort list */
            for (int cursor = i; cursor > 0; cursor--) {
                if (arr[cursor] < arr[cursor - 1]) {
                    int temp = arr[cursor - 1];
                    arr[cursor - 1] = arr[cursor];
                    arr[cursor] = temp;
                } else {   // break equals
                    break;
                }
            }

        }

        return arr;
    }
}
