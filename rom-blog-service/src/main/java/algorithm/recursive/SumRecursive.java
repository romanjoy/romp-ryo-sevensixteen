package algorithm.recursive;

/**
 * SumRecursive
 * <br>
 * Formula: <br>
 *   &nbsp;&nbsp; Sum(n) = n + Sum(n-1)<br>
 *   &nbsp;&nbsp; Sum(3) = 3 + Sum(2), Sum(2) = 2 + Sum(1), Sum(1) = 1
 *
 * @author Roman Fu
 * @version 1.0
 */
public class SumRecursive {
    private SumRecursive() {
        throw new IllegalStateException("Utility class");
    }

    public static int sumRecursive(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumRecursive(num - 1);
        }
    }
}
