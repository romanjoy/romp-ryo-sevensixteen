package com.example.design;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;


public class SingletonOneUnitTest {

    @Test
    public void searchLow() throws Exception {
        Constructor<SingletonOne> construct = SingletonOne.class.getDeclaredConstructor();
        construct.setAccessible(true);
        SingletonOne obj1 = construct.newInstance();
        SingletonOne obj2 = SingletonOne.getInstance2();

        Assert.assertNotSame(obj1, obj2);
    }

}
