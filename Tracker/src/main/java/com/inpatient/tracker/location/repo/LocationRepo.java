package com.inpatient.tracker.location.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inpatient.tracker.location.entity.LocationEntity;

@Repository
public interface LocationRepo extends CrudRepository<LocationEntity, Long>{

}
