package com.ibm.spring.core.di.interfaces;

import java.util.List;

public class CustomerDAO {
    private Repository repository;

    public CustomerDAO() {
    }

    public CustomerDAO(Repository repository) {
        this.repository = repository;
    }

    public Repository getRepository() {
        return repository;
    }
    //biz method


    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
