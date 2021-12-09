package com.plf.demo.repository;

import com.plf.demo.entity.AmendementActuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmendementActuelRepository extends JpaRepository<AmendementActuel, Long> {
}
