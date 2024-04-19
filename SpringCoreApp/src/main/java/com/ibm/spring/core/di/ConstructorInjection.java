package com.ibm.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-di-constructors.xml");
        //Get the customer Bean
        Customer customer = context.getBean(Customer.class);
        //Get all Customer information
//        System.out.println("Id" + customer.getId());
//        System.out.println("Name " + customer.getName());
//        System.out.println("Address " + customer.getAddress().getCity() + " " + customer.getAddress().getState());

        System.out.println(customer);
        Address address = context.getBean(Address.class);
        System.out.println(address);

    }
}
