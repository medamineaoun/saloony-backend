package com.aoun.treatmentmanagment;
//import com.saloony.saloonybackend.appointment.Appointment;
//import com.aoun.salonmanagement.entity.Salon;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long treatmentId;
    private String treatmentCategory;
    private String treatmentName;
    private String treatmentDescription;
    private int  treatmentTime;
    private double treatmentPrice;
    private Long salonId;
   // @ManyToOne
    //@JoinColumn(name = "salon_id")
  //  private Salon salon;

   // @OneToMany(mappedBy = "treatment")
   // private List<Appointment> appointments;
}
