package com.aoun.treatmentmanagment;

import java.util.List;

public interface ITreatmentService {
    public List<Treatment> retrieveAllTreatments();
    public Treatment retrieveTreatment(Long treatmentId);
    public Treatment addTreatment(Treatment treatment);
    public void removeTreatment(Long treatmentId);
    public Treatment modifyTreatment(Treatment treatment);
}
