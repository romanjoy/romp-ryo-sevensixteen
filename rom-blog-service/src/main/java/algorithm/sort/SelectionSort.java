package algorithm.sort;

/**
 * @author fuqiliang
 * <p>
 * Selection Sort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 4};

        for (int i = 0; i < arr.length; i++) {  // foreach arr length
            int min = arr[i];  // default first is min
            int index = i;

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

        for (int a : arr) {
            System.out.print(" " + a);
        }
    }
}
