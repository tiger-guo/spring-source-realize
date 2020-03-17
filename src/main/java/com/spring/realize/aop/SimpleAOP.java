package com.spring.realize.aop;

import java.lang.reflect.Proxy;

/**
 * @program: spring-source-realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 14:51
 **/

public class SimpleAOP {
    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(),
                bean.getClass().getInterfaces(), advice);
    }
}
