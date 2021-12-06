package com.plf.demo.repository;

import com.plf.demo.entity.Amendement;
import com.plf.demo.entity.Changement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmendementRepository extends JpaRepository<Amendement, Long> {
}
