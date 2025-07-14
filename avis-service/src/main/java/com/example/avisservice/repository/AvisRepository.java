package com.example.avisservice.repository;


import com.example.avisservice.entity.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.avisservice.entity.Avis;
import java.util.List;

public interface AvisRepository extends JpaRepository<Avis, Long> {
    List<Avis> findByCoiffeurId(Long coiffeurId);
}
