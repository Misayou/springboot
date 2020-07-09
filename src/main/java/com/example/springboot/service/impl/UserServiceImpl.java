package com.example.springboot.service.impl;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/9
 * @Description: com.example.springboot.service.impl
 * @versio: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Resource
    private UserMapper userMapper;


    @Override
    public User loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
