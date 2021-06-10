package algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertSortTest {

    @Test
    public void insertSort() {
        int[] input = {8, 5, 3, 2, 4};
        int[] expect = {2, 3, 4, 5, 8};

        Assert.assertTrue(Arrays.equals(expect, InsertSort.sort(input)));
    }
}
