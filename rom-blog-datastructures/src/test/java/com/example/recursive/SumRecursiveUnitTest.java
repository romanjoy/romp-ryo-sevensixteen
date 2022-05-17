package com.example.recursive;

import org.junit.Assert;
import org.junit.Test;


public class SumRecursiveUnitTest {

    @Test
    public void removeMax() {
        SumRecursive recursive = new SumRecursive();
        int num = recursive.sumRecursive(100);
        Assert.assertEquals(5050 , num);
    }
}
