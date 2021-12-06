package com.plf.demo.repository;

import com.plf.demo.entity.Titre;
import com.plf.demo.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitreRepository extends JpaRepository<Titre, Long> {
}
