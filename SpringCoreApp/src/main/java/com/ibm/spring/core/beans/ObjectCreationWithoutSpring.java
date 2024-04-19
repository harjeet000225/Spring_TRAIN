package com.ibm.spring.core.beans;

public class ObjectCreationWithoutSpring {
    public static void main(String[] args) {
        //create object
        Customer customer = new Customer();
        //populate data : via setters
        customer.setId(1);
        customer.setName("Subramanian Murugan");

        //read Data : via getters
        System.out.println(customer.getId() + " " + customer.getName());

        //via constructor how to initialize object
        customer = new Customer(2, "Murugan");
        System.out.println(customer.getId() + " " + customer.getName());

    }
}
