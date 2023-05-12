package com.inpatient.tracker.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inpatient.tracker.location.entity.LocationEntity;
import com.inpatient.tracker.location.repo.LocationRepo;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepo locationRepository;
	
	@Override
	public LocationEntity addLocation(LocationEntity location) {
		return locationRepository.save(location);
	}

	@Override
	public List<LocationEntity> getAllLocation() {
		return (List<LocationEntity>) locationRepository.findAll();
	}
}
