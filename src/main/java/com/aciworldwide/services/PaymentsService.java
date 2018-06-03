package com.aciworldwide.services;

import com.aciworldwide.domain.models.Payment;

import java.util.List;

public interface PaymentsService {
    List<Payment> findAll();

    Payment findPaymentById(Long id);

    void save(Payment payment);

    void delete(Payment payment);
}
