package com.spring.realize.service.impl;

import com.spring.realize.service.HelloService;

/**
 * @program: spring-source-realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 14:52
 **/

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }
}
