package com.inpatient.tracker.admission.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inpatient.tracker.admission.entity.Admission;

@Repository
public interface AdmissionRepo extends CrudRepository<Admission, Long>{
	public Optional<Admission> findById(Long travellerid);
}
