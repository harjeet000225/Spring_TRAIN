package com.ibm.spring.core.annotations.streotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class ComponentAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotations-stereo.xml");
        OrderService orderService = context.getBean(OrderService.class);
        System.out.println(orderService.findAll());
        System.out.println(orderService.getProducts());
    }
}
