package com.aciworldwide.services.implementations;

import com.aciworldwide.domain.models.Biller;
import com.aciworldwide.repositories.BillersRepository;
import com.aciworldwide.services.BillersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillersServiceImpl implements BillersService {
    private final BillersRepository billersRepository;

    @Autowired
    public BillersServiceImpl(BillersRepository billersRepository) {
        this.billersRepository = billersRepository;
    }

    @Override
    public List<Biller> findAll() {
        return billersRepository.findAll();
    }

    @Override
    public Biller findBillerById(Integer id) {
        return billersRepository.findBillerById(id);
    }

    @Override
    public void save(Biller biller) {
        billersRepository.save(biller);
    }

    @Override
    public void delete(Biller biller) {
        billersRepository.delete(biller);
    }
}
