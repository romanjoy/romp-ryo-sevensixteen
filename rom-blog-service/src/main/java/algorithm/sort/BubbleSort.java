package algorithm.sort;

/**
 * @author fuqiliang
 * <p>
 * bubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {8, 5, 3, 2, 4};

        for (int i = 0; i < arr.length; i++) {  // foreach arr length
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];  // change pos
                    arr[j] = temp;
                }
            }
        }

        for (int a : arr) {
            System.out.print(" " + a);
        }
    }
}
