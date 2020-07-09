package com.example.springboot;

import com.example.springboot.pojo.User;
import com.example.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User user = userService.loginIn("tw","123");
        System.out.println("该用户ID为：");
        System.out.println(user.getId());
    }

}
