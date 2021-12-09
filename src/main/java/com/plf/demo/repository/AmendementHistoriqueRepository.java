package com.plf.demo.repository;

import com.plf.demo.entity.AmendementHistorique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmendementHistoriqueRepository extends JpaRepository<AmendementHistorique, Long> {
}
