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

            for (int cusor = i; cusor > 0; cusor--) {  // cursor from right to left
                if (arr[cusor] < arr[cusor - 1]) {
                    int temp = arr[cusor - 1];
                    arr[cusor - 1] = arr[cusor];
                    arr[cusor] = temp;
                } else {  // else break loop
                    break;
                }
            }
        }

        return arr;
    }
}
