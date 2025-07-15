package com.aoun.salonmanagement.repository;

import com.aoun.salonmanagement.entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonRepository extends JpaRepository<Salon,Long> {
}
