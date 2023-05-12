package com.inpatient.tracker.admission.service;

import java.util.List;
import java.util.Optional;

import com.inpatient.tracker.admission.entity.Admission;

public interface AdmissionService {
	public Admission patientadmission(Admission admission);
	public List<Admission> admissionlist();
	public Optional <Admission> admissionGetById(Long admissionid);
	public void deleteById(Long admissionid);
	public Admission updateadmission(Admission admission);
}
