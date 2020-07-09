package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/9
 * @Description: com.example.springboot.controller
 * @versio: 1.0
 */
@Controller
public class TestController {

    @RequestMapping("index")
    public String testIndex(){
        return "index";
    }
}
