package com.spring.test.service;

import org.springframework.stereotype.Service;

/**
 * Created by xinyuangui on 15/8/22.
 */
@Service
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "名字："+name;
    }
}
