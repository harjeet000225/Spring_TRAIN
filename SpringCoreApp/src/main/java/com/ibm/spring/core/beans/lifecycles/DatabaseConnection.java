package com.ibm.spring.core.beans.lifecycles;

public class DatabaseConnection {

    public void init() {
        System.out.println("Database is being initialized");
    }

    public void destroy() {
        System.out.println("Database connection is closed");
    }

}
