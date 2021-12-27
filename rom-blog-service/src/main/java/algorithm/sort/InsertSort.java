package algorithm.sort;

/**
 * Insert Sort
 *
 * @reference InsertSort.gif
 * @author Roman Fu
 * @version 1.0
 */
public class InsertSort {
    private InsertSort() {
        throw new IllegalStateException("Utility class");
    }

    public static int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {  // equal times = from second element to arr.length

            for (int index = i; index > 0; index--) {  // index moved from right to left
                if (arr[index] < arr[index - 1]) {
                    int temp = arr[index - 1];
                    arr[index - 1] = arr[index];
                    arr[index] = temp;
                } else {   // break
                    break;
                }
            }

        }

        return arr;
    }
}
