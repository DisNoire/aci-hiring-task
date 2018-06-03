package com.aciworldwide.services;

import com.aciworldwide.domain.models.Biller;

import java.util.List;

public interface BillersService {
    List<Biller> findAll();

    Biller findBillerById(Integer id);

    void save(Biller biller);

    void delete(Biller biller);
}
