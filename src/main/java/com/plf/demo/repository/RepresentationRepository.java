package com.plf.demo.repository;

import com.plf.demo.entity.Representation;
import com.plf.demo.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepresentationRepository extends JpaRepository<Representation, Long> {
}
