package com.inpatient.tracker.doctor.controller;

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

import com.inpatient.tracker.doctor.entity.DoctorEntity;
import com.inpatient.tracker.doctor.service.DoctorService;

@RestController
public class DoctorController
{
	@Autowired
	DoctorService doctorService;
	
	
	@PostMapping("/doctor")	
	public DoctorEntity doctorEntity(@RequestBody DoctorEntity doctorentity) {
		//System.out.println(doctorentity.toString());
		return doctorService.addDoctor(doctorentity);
	}
	
	@GetMapping("/doctor")
	public List<DoctorEntity> doctorList() {
		return doctorService.getAllDoctors();
	}
	
	@GetMapping("/doctor/{doctorid}")
	public Optional<DoctorEntity> doctorGetById(@PathVariable  Long doctorid) {
		return doctorService.doctorGetById(doctorid);
	} 
	
	@DeleteMapping("/doctor/{doctorid}")
	public void deleteById(@PathVariable Long doctorid){
		doctorService.deleteDoctorById(doctorid);
	}

	@PutMapping("/doctor")
	public DoctorEntity updatedoctor(@RequestBody DoctorEntity doctor){
		return doctorService.updatedoctor(doctor);
	}

}
