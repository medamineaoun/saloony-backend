package com.aoun.treatmentmanagment;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/treatment")
public class TreatmentController {
    TreatmentService treatmentService;

    @GetMapping("/retrieve-all-treatments")
    public List<Treatment> getTreatments(){
        return treatmentService.retrieveAllTreatments();
    }

    @PostMapping("/add-treatment")
    public Treatment addTreatment(@RequestBody Treatment treatment){
        return treatmentService.addTreatment(treatment);
    }

    @GetMapping("/retrieve-treatment/{treatment-id}")
    public Treatment retrieveTreatment(@PathVariable("treatment-id") Long treatmentId){
        return treatmentService.retrieveTreatment(treatmentId);
    }

    @DeleteMapping("/remove-treatment/{treatment-id}")
    public void removeTreatment(@PathVariable("treatment-id") Long treatmentId){
        treatmentService.removeTreatment(treatmentId);
    }

    @PutMapping("/modify-treatment")
    public Treatment modifyTreatment(@RequestBody Treatment treatment){
        return treatmentService.modifyTreatment(treatment);
    }
}
