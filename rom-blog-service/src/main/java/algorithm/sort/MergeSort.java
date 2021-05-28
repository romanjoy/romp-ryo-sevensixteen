package algorithm.sort;

//TODO
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {7, 5, 3, 2, 4, 1, 6};

        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);
        System.out.println("merge sort over.");
    }

    /* mergeSort */
    public static void mergeSort(int[] arr, int start, int end) {
        if (end - start > 0) {
            mergeSort(arr, start, (start + end) / 2);
            mergeSort(arr, (start + end) / 2 + 1, end);

            int left = start;  // begin
            int right = (start + end) / 2 + 1;
            int index = 0;
            int[] result = new int[end - start + 1];  // build new array

            //
            while (left <= (start + end) / 2 && right <= end) {
                if (arr[left] <= arr[right]) {
                    result[index] = arr[left];
                    left++;
                } else {
                    result[index] = arr[right];
                    right++;
                }
                index++;
            }

            //
            while (left <= (start + end) / 2 || right <= end) {
                if (left <= (start + end) / 2) {
                    result[index] = arr[left];
                    left++;
                } else {
                    result[index] = arr[right];
                    right++;
                }
                index++;
            }

            for (int i = start; i <= end; i++) {
                arr[i] = result[i - start];  // rebuild new array
            }
        }
    }
}
