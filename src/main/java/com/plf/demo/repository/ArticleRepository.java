package com.plf.demo.repository;

import com.plf.demo.entity.Changement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Changement, Long> {
}
