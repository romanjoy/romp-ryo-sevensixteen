package algorithm.sort;

/**
 * @author fuqiliang
 * <p>
 * Insert Sort
 */
public class InsertSort {

    public static void main(String[] args) {
        int arr[] = {7, 5, 3, 2, 4};

        for (int i = 1; i < arr.length; i++) {  // foreach arr length
            for (int j = i; j > 0; j--) {  // right --> left, begin from pos[1]
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }

        for (int a : arr) {
            System.out.print(" " + a);
        }
    }
}
