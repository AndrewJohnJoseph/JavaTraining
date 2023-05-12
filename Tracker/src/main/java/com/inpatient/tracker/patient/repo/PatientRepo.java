package com.inpatient.tracker.patient.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.inpatient.tracker.patient.entity.Patient;

@Repository
public interface PatientRepo extends CrudRepository<Patient, Long> {
}
