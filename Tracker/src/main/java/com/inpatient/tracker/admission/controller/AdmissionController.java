package com.inpatient.tracker.admission.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inpatient.tracker.admission.entity.Admission;
import com.inpatient.tracker.admission.service.AdmissionService;

@RestController
public class AdmissionController {
	
	@Autowired
	AdmissionService admissionService;

	
	@PostMapping("/admission")	
	public Admission admission(@RequestBody Admission admission) {
		//System.out.println(admission.toString());
		return admissionService.patientadmission(admission);
	}
	
	@GetMapping("/admission")
	public List<Admission> admissionlist() {
		return admissionService.admissionlist();
	}
	
	@GetMapping("/admission/{admissionid}")
	public Optional <Admission> admissionGetById(@PathVariable Long admissionid){
		return admissionService.admissionGetById(admissionid);
	}
	
	@DeleteMapping("/admission/{admissionid}")
	public void deleteById(@PathVariable Long admissionid){
		admissionService.deleteById(admissionid);
	}
	
	@PutMapping("/admission")
	public Admission updateadmission(@RequestBody Admission admission){
		return admissionService.updateadmission(admission);
	}
}
