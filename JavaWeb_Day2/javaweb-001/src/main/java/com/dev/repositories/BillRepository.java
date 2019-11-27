package com.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.entities.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {
}
