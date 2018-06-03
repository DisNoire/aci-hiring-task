package com.aciworldwide.services.implementations;

import com.aciworldwide.domain.models.Payment;
import com.aciworldwide.repositories.PaymentsRepository;
import com.aciworldwide.services.PaymentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentsServiceImpl implements PaymentsService {
    private final PaymentsRepository paymentsRepository;

    public PaymentsServiceImpl(PaymentsRepository paymentsRepository) {
        this.paymentsRepository = paymentsRepository;
    }

    @Override
    public List<Payment> findAll() {
        return paymentsRepository.findAll();
    }

    @Override
    public Payment findPaymentById(Long id) {
        return paymentsRepository.findPaymentById(id);
    }

    @Override
    public void save(Payment payment) {
        paymentsRepository.save(payment);
    }

    @Override
    public void delete(Payment payment) {
        paymentsRepository.delete(payment);
    }
}
