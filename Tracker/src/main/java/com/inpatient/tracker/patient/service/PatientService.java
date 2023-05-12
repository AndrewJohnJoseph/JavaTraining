package com.inpatient.tracker.patient.service;
import java.util.List;

import com.inpatient.tracker.patient.entity.Patient;

public interface PatientService {
	public Patient patientregister(Patient patient);
	public List<Patient> Patientlist();
	public void deletePatientById(long Id);
	public Patient updatePatient(Patient patient);
}
