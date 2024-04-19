package com.ibm.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectCreationsWithSpring {
    public static void main(String[] args) {
        //initialize the spring container and gets the bean from spring container
        //Load Spring Container:XMLContainer,JavaConfigContainer,BootContainer
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Customer cust = context.getBean(Customer.class);
        System.out.println(cust.getId() + cust.getName());

        cust.setName("Subramaniam");
        cust.setId(1);

        System.out.println(cust.getId() + cust.getName());

        cust.setId(3);
        cust.setName("Ram");
        System.out.println(cust.getId() + cust.getName());


    }
}
