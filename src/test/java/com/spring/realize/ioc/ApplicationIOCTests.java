package com.spring.realize.ioc;

import com.spring.realize.domain.Product;
import org.junit.jupiter.api.Test;

/**
 * @program: spring-source-realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 14:41
 **/

public class ApplicationIOCTests {


    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIOC simpleIOC = new SimpleIOC(location);
        Product product = (Product)simpleIOC.getBean("product");
        System.out.println(product);
    }
}
