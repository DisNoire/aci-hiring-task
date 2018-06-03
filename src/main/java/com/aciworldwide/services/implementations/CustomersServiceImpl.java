package com.aciworldwide.services.implementations;

import com.aciworldwide.domain.models.Customer;
import com.aciworldwide.repositories.CustomersRepository;
import com.aciworldwide.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersServiceImpl implements CustomersService {
    private final CustomersRepository customersRepository;

    @Autowired
    public CustomersServiceImpl(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }
    @Override
    public List<Customer> findAll() {
        return customersRepository.findAll();
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return customersRepository.findCustomerById(id);
    }

    @Override
    public void save(Customer customer) {
        customersRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customersRepository.delete(customer);
    }
}
