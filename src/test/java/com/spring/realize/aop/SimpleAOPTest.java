package com.spring.realize.aop;

import com.spring.realize.service.HelloService;
import com.spring.realize.service.impl.HelloServiceImpl;
import org.junit.jupiter.api.Test;

/**
 * @program: spring-source-realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 14:53
 **/

public class SimpleAOPTest {

    @Test
    public void getProxy() throws Exception {
        // 1. 创建一个 MethodInvocation 实现类
        MethodInvocation logTask = () -> System.out.println("log task start");
        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();

        // 2. 创建一个 Advice
        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);

        // 3. 为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(helloServiceImpl,beforeAdvice);

        helloServiceImplProxy.sayHelloWorld();
    }
}
