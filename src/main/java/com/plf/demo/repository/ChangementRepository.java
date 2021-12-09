package com.plf.demo.repository;

import com.plf.demo.entity.Changement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChangementRepository extends JpaRepository<Changement, Long> {

    List<Changement> findByAmendementId(long amendmentId);
}
