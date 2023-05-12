package com.inpatient.tracker.doctor.service;


import java.util.List;
import java.util.Optional;

import com.inpatient.tracker.doctor.entity.DoctorEntity;
import com.inpatient.tracker.login.entity.LoginEntity;

public interface DoctorService {
	public List<DoctorEntity> getAllDoctors();
	public DoctorEntity addDoctor(DoctorEntity doctor);
	public Optional<DoctorEntity> doctorGetById(Long doctorid);
	public void deleteDoctorById(long doctorid);
	public DoctorEntity updatedoctor(DoctorEntity doctor);

}
