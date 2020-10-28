package com.qf.arner.spring;

import com.qf.arner.spring.bean.Address;
import com.qf.arner.spring.bean.User;
import com.qf.arner.spring.config.TestConfig;
import com.qf.arner.spring.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        String path = "classpath:spring-context.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(path);
       /* User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println(user.toString());*/

        /*UserController userController = classPathXmlApplicationContext.getBean("userController",UserController.class);
        userController.sayHello();*/


        TestConfig testConfig = classPathXmlApplicationContext.getBean("testConfig",TestConfig.class);
        Address address = testConfig.address();
        User user = testConfig.user(address);
        System.out.println(user);
    }
}
