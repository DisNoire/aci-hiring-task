package com.aciworldwide.repositories;

import com.aciworldwide.domain.models.Biller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillersRepository extends JpaRepository<Biller, Integer> {
    Biller findBillerById(Integer id);
}
