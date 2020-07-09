package com.example.springboot.service;

import com.example.springboot.pojo.User;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/9
 * @Description: com.example.springboot.service
 * @versio: 1.0
 */
public interface UserService {
    User loginIn(String name,String password);
}
