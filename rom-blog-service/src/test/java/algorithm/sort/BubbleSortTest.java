package algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] input = {8, 5, 3, 2, 4};
        int[] expect = {2, 3, 4, 5, 8};

        Assert.assertTrue(Arrays.equals(expect, BubbleSort.bubbleSort(input)));
    }
}
