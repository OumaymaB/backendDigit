package com.plf.demo.repository;

import com.plf.demo.entity.Utilisateur;
import com.plf.demo.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
