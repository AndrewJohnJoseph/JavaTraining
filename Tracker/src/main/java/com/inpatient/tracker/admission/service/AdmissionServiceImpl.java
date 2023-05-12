package com.inpatient.tracker.admission.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inpatient.tracker.admission.entity.Admission;
import com.inpatient.tracker.admission.repo.AdmissionRepo;

@Service
public class AdmissionServiceImpl implements AdmissionService {

	@Autowired
	AdmissionRepo admissionRepo;
	
	@Override
	public Admission patientadmission(Admission admission) {
		return admissionRepo.save(admission);
	}

	@Override
	public List<Admission> admissionlist() {
		return (List<Admission>)admissionRepo.findAll();
	}
	
	@Override
	public Optional <Admission> admissionGetById(Long admissionid) {
		return admissionRepo.findById(admissionid);
	}
	
	@Override
	public void deleteById(Long admissionid) {
		 admissionRepo.deleteById(admissionid);
	}

	@Override
	public Admission updateadmission(Admission admission) {
		Admission existingadmission = admissionRepo.findById(admission.getAdmissionid()).orElse(null);
		existingadmission.setAdmissiondate(admission.getAdmissiondate());
		existingadmission.setLengthofstay(admission.getLengthofstay());
		return admissionRepo.save(existingadmission);
	}
}

