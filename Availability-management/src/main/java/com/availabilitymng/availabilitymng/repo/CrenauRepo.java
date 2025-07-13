package com.availabilitymng.availabilitymng.repo;

import com.availabilitymng.availabilitymng.entity.Crenau;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CrenauRepo extends JpaRepository<Crenau, Long> {
    List<Crenau> findByDisponibleTrueAndDateHeureDebutAfter(LocalDateTime now);
}
