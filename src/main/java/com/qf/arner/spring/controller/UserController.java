package com.qf.arner.spring.controller;

import com.qf.arner.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Autowired 作用在对象、方法、构造方法、注解等上，将作用的内容放到容器中
 * @ualifier（“依赖名”） 配合@Autowired使用，根据依赖名创建对象
 */

@Controller
public class UserController {
    @Autowired
    @Qualifier("userService")
    public UserService userService;

    public void sayHello(){
        int save = userService.save();
    }
}
