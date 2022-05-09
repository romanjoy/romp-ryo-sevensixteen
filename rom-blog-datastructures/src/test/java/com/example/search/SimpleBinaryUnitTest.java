package com.example.search;

import org.junit.Assert;
import org.junit.Test;


public class SimpleBinaryUnitTest {
    @Test
    public void searchLow() {
        int[] arr = {8, 5, 3, 2, 9, 10, 99, 35, 55, 24, 44};
        SimpleBinary simpleBinary = new SimpleBinary();
        Assert.assertEquals(5, simpleBinary.binary(arr, arr.length, 10));
    }

}
