package com.inpatient.tracker.location.service;

import java.util.List;

import com.inpatient.tracker.location.entity.LocationEntity;

public interface LocationService {
	public LocationEntity addLocation(LocationEntity location);

	public List<LocationEntity> getAllLocation();
}
