package algorithm;

/**
 * @author fuqiliang
 * <p>
 * BinarySearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 9, 14, 15};
        int index = bsearch(arr, arr.length, 9);
        System.out.println(index);
    }

    static int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {  // <=
            int mid = low + ((high - low) >> 1);  // find mid (bit)
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
