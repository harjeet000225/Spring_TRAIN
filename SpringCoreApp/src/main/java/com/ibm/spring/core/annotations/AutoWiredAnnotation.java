package com.ibm.spring.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiredAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation-scanner.xml");
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);
    }
}
