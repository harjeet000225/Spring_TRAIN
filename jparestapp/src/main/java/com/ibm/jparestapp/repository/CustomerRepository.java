package com.ibm.jparestapp.repository;

import com.ibm.jparestapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //customer db apis
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
