package com.example.recursive;

/**
 * SumRecursive
 *
 * <p>Formula:</p>
 *   <p>&nbsp;&nbsp; Sum(n) = n + Sum(n-1)
 *   <p>&nbsp;&nbsp; Sum(3) = 3 + Sum(2), Sum(2) = 2 + Sum(1), Sum(1) = 1
 *
 * @author Roman Fu
 * @version 1.0
 */
public class SumRecursive {

    public int sumRecursive(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumRecursive(num - 1);
        }
    }
}
