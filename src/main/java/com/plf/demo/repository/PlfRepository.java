package com.plf.demo.repository;

import com.plf.demo.entity.Plf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlfRepository extends JpaRepository<Plf, Long> {
}
