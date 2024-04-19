package com.ibm.spring.core.annotations;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class Customer {
    private int id;
    private String name;
    @Autowired
    private Address address;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Init.....");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Customer() {
    }

    public Customer(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
