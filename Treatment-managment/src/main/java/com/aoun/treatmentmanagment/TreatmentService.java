package com.aoun.treatmentmanagment;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TreatmentService implements ITreatmentService{
    TreatmentRepository treatmentRepository;
    @Override
    public List<Treatment> retrieveAllTreatments() {
        return treatmentRepository.findAll();
    }

    @Override
    public Treatment retrieveTreatment(Long treatmentId) {
        return treatmentRepository.findById(treatmentId).get();
    }

    @Override
    public Treatment addTreatment(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }

    @Override
    public void removeTreatment(Long treatmentId) {
        treatmentRepository.deleteById(treatmentId);
    }

    @Override
    public Treatment modifyTreatment(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }
}
