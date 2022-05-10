package com.example.design;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;


public class SingletonTwoUnitTest {

    @Test
    public void searchLow() throws Exception {
        Constructor<SingletonTwo> construct = SingletonTwo.class.getDeclaredConstructor();
        construct.setAccessible(true);
        SingletonTwo obj1 = construct.newInstance();
        SingletonTwo obj2 = SingletonTwo.getInstance();

        Assert.assertNotSame(obj1, obj2);
    }

}
