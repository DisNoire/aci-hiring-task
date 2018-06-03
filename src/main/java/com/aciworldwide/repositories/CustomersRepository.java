package com.aciworldwide.repositories;

import com.aciworldwide.domain.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customer, Integer> {
    Customer findCustomerById(Integer id);
}
