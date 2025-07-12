package com.example.gestionrdv.RDVREST;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoiffureDTORepository extends JpaRepository<CoiffureDTO, Integer> {

}
