package com.inpatient.tracker.doctor.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inpatient.tracker.doctor.entity.DoctorEntity;

@Repository
public interface DoctorRepo extends CrudRepository<DoctorEntity, Long>{
	public Optional<DoctorEntity> findById(Long doctorid);

}