package com.ibm.spring.core.di.interfaces;

import java.util.List;

public class SQLRepositoryImpl implements Repository {
    @Override
    public List<String> listAll() {
        return List.of("CREATE", "UPDATE", "DELETE", "SELECT");
    }
}
