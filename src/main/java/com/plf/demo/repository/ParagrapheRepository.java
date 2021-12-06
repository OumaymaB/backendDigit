package com.plf.demo.repository;

import com.plf.demo.entity.Paragraphe;
import com.plf.demo.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParagrapheRepository extends JpaRepository<Paragraphe, Long> {
}
