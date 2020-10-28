package com.qf.arner.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;


@Data
@Component
public class User {
    private String username;
    private String password;
    private List<Integer> list;
    private Address address;

}
