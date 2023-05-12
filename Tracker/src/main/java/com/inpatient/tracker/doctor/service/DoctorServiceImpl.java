package com.inpatient.tracker.doctor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inpatient.tracker.doctor.entity.DoctorEntity;
import com.inpatient.tracker.doctor.repo.DoctorRepo;
import com.inpatient.tracker.login.entity.LoginEntity;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepo doctorRepo;

	@Override
	public List<DoctorEntity> getAllDoctors() {
		return (List<DoctorEntity>) doctorRepo.findAll();
	}

	@Override
	public DoctorEntity addDoctor(DoctorEntity doctor) {
		return doctorRepo.save(doctor);
	}
	
	@Override
	public Optional<DoctorEntity> doctorGetById(Long doctorid) {
		return  doctorRepo.findById(doctorid);
	}
	@Override
	public void deleteDoctorById(long doctorid) {
		doctorRepo.deleteById(doctorid);
	}


	@Override
	public DoctorEntity updatedoctor(DoctorEntity doctor) {
		DoctorEntity existdoctor = doctorRepo.findById(doctor.getDoctorid()).orElse(null);
		existdoctor.setName(doctor.getName());
		existdoctor.setContact_No(doctor.getContact_No());
		return doctorRepo.save(existdoctor);
	}

}


