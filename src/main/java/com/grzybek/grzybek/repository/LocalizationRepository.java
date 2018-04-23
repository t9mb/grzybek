package com.grzybek.grzybek.repository;

import com.grzybek.grzybek.domain.Localization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizationRepository extends JpaRepository<Localization, Integer> {
}
