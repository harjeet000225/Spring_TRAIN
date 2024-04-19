package com.ibm.spring.core.di.interfaces;

import java.util.List;

public class NOSQLRepositoryImpl implements Repository {
    @Override
    public List<String> listAll() {
        return List.of("SET", "GET");
    }
}
