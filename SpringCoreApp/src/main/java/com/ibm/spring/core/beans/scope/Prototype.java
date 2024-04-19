package com.ibm.spring.core.beans.scope;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prototype {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-scope.xml");
        Hello hello1 = context.getBean(Hello.class);
        System.out.println(hello1.hashCode());

        Hello hello2 = context.getBean(Hello.class);
        System.out.println(hello2.hashCode());
    }
}
