package com.example.springboot.controller;

import com.example.springboot.pojo.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/9
 * @Description: com.example.springboot.controller
 * @versio: 1.0
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        User user = userService.loginIn(name,password);
        if(user!=null){
            return "success";
        }else{
            return "error";
        }
    }
}
