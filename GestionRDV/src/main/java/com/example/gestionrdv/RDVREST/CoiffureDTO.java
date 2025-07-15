package com.example.gestionrdv.RDVREST;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoiffureDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_coiffure;
    private String nom_coiffure;

    public CoiffureDTO(int Id_coiffure) {
        this.Id_coiffure = Id_coiffure;
    }


}
