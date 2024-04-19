package com.ibm.spring.core.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");
        User user = context.getBean(User.class);
        System.out.println(user.getName() + user.getPassword());
    }
}
