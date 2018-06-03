package com.aciworldwide.repositories;

import com.aciworldwide.domain.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentsRepository extends JpaRepository<Payment, Long> {
    Payment findPaymentById(Long id);
}
