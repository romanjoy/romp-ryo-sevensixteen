package com.example.rom.mapper;

import mybatisplus.demo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisDemoTest {
    @Autowired
    private MyBatisDemoMapper mapper;

    @Test
    public void selectUsers() {
        List<User> users = mapper.selectList(null);
        users.forEach(System.out::println);
        System.out.println(users.size());
    }
}
