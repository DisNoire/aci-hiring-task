package com.aciworldwide.services;

import com.aciworldwide.domain.models.Customer;

import java.util.List;

public interface CustomersService {
    List<Customer> findAll();

    Customer findCustomerById(Integer id);

    void save(Customer customer);

    void delete(Customer customer);
}
