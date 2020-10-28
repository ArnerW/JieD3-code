package com.qf.arner.spring.service.serviceImpl;

import com.qf.arner.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public int save() {
        System.out.println("hello");
        return 0;
    }
}
