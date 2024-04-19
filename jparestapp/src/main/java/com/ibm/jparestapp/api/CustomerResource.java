package com.ibm.jparestapp.api;

import com.ibm.jparestapp.entity.Customer;
import com.ibm.jparestapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customers")
public class CustomerResource {

    @Autowired
    private CustomerRepository repository;

    //find all
    @GetMapping
    public List<Customer> findAll() {
        return repository.findAll();
    }

    //findById
    @GetMapping("{id}")
    public ResponseEntity<Customer> findById(@PathVariable("id") Long id) {
        Optional<Customer> customer = repository.findById(id);

        if (customer.isPresent()) {
            return new ResponseEntity<>(customer.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    //remove row
    @DeleteMapping("{id}")
    public ResponseEntity<Customer> remove(@PathVariable("id") Long id) {
        try {
            Optional<Customer> customer = repository.findById(id);
            if (customer.isPresent()) {
                repository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("{id}")
    public ResponseEntity<Customer> update(@PathVariable("id") Long id, @RequestBody Customer customer) {
        try {
            Optional<Customer> customerFound = repository.findById(id);
            if (customerFound.isPresent()) {
                //update logic
                Customer tmpCustomer = customerFound.get();
                //
                tmpCustomer.setFirstName(customer.getFirstName());
                tmpCustomer.setLastName(customer.getLastName());
                Customer updatedCustomer = repository.save(tmpCustomer);
                return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
            }
            return new ResponseEntity<>(new Customer(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping
    //save
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        Customer savedCustomer = repository.save(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }


}
