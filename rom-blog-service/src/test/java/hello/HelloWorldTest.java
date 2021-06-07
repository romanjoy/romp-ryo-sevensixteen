package hello;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void sayHello() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals("hello world", helloWorld.sayHello());
    }

}
