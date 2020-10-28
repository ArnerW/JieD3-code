package com.qf.arner.spring.config;

import com.qf.arner.spring.bean.Address;
import com.qf.arner.spring.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration搭配@Bean使用
 */
@Configuration
public class TestConfig {
    @Bean
    public User user(Address address){
        User user = new User();
        user.setUsername("lisi");
        user.setPassword("123456");
        user.setAddress(address);
        return user;
    }

    @Bean
    public Address address() {
        return new Address();
    }
}
