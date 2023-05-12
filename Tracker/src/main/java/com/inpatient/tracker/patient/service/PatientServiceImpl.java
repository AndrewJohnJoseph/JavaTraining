package com.inpatient.tracker.patient.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inpatient.tracker.patient.entity.Patient;
import com.inpatient.tracker.patient.repo.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepo patientRepo;

	@Override
	public Patient patientregister(Patient patinet) {
		return patientRepo.save(patinet);
	}

	@Override
	public List<Patient> Patientlist() {
		return (List<Patient>) patientRepo.findAll();
	}


	@Override
	public void deletePatientById(long Id) {
		patientRepo.deleteById(Id);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		Patient existingpatient = patientRepo.findById(patient.getPatientid()).orElse(null);
		existingpatient.setBloodgroup(patient.getBloodgroup());
		existingpatient.setPatientName(patient.getPatientName());
		return patientRepo.save(existingpatient);
	}
}
