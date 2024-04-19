package com.ibm.spring.core.di.autowrires;

import com.ibm.spring.core.di.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowire.xml");
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);

    }
}
