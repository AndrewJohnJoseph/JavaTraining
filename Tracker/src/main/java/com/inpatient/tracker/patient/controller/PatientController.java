package com.inpatient.tracker.patient.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.inpatient.tracker.patient.entity.Patient;
import com.inpatient.tracker.patient.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	PatientService patientservice;

	@PostMapping("/Patient")
	public Patient patient(@RequestBody Patient patient) {
		return patientservice.patientregister(patient);
	}

	@GetMapping("/Patient")
	public List<Patient> Patientlist() {
		return patientservice.Patientlist();
	}

	@DeleteMapping("/Patient/{Id}")
	public void deletePatientById(@PathVariable Long Id) {
		patientservice.deletePatientById(Id);
	}

	@PutMapping("/Patient")
	public Patient updatePatient(@RequestBody Patient Patient) {
		return patientservice.updatePatient(Patient);
	}
	 
}
