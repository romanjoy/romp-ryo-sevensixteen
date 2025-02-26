package com.example.binary;

import org.junit.Assert;
import org.junit.Test;


public class SimpleBinaryUnitTest {
    @Test
    public void searchLow() {
        int[] arr = {2, 3, 5, 8, 9, 10, 24, 35, 44, 55, 99, 100};

        SimpleBinary simpleBinary = new SimpleBinary();
        Assert.assertEquals(9, arr[simpleBinary.runBinarySearchIteratively(arr, 9, 0, arr.length - 1)]);
    }

}
