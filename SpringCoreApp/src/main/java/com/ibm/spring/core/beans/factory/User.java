package com.ibm.spring.core.beans.factory;

public class User {
    private String name;
    private String password;

    private User() {

    }

    public String getName() {
        return name;
    }

    //Factory Method
    public static User getInstance() {
        System.out.println("Factory");
        return new User();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
