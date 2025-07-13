package com.aoun.salonmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salonId;
    private String salonName;
    @Enumerated(EnumType.STRING)
    private SalonType salonType;
    private String salonDescription;

    @Enumerated(EnumType.STRING)
    private AdditionalService additionalService;
}
