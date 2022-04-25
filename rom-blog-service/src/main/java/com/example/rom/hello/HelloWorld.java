package com.example.rom.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Say hello world
 *
 * @author Roman Fu
 * @version 1.1
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "hello world";
    }

}
