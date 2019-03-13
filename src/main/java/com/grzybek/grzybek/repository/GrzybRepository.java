package com.grzybek.grzybek.repository;

import com.grzybek.grzybek.domain.Grzyb;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface GrzybRepository extends JpaRepository<Grzyb, Integer> {
}
