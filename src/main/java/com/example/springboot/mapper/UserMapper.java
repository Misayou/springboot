package com.example.springboot.mapper;

import com.example.springboot.pojo.User;
import org.apache.ibatis.annotations.Param;


/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/9
 * @Description: com.example.springboot.mapper
 * @versio: 1.0
 */
public interface UserMapper {
    User getInfo(@Param("name") String name,@Param("password") String password);
}
