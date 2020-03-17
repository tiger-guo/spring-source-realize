package com.spring.realize.aop;

import java.lang.reflect.Method;

/**
 * @program: spring-source-realize
 * @description: 实现了 Advice 接口，是一个前置通知
 * @author: liuguohu
 * @create: 2020-03-17 14:49
 **/

public class BeforeAdvice implements Advice{
    private Object bean;
    private MethodInvocation methodInvocation;

    public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在目标方法执行前调用通知
        methodInvocation.invoke();
        return method.invoke(bean, args);
    }
}
