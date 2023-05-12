package com.inpatient.tracker.location.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inpatient.tracker.location.entity.LocationEntity;
import com.inpatient.tracker.location.repo.LocationRepo;
import com.inpatient.tracker.location.service.LocationService;

@RestController
public class LocationController {
	@Autowired
	LocationService locationService;

	@PostMapping("/location")
	public LocationEntity addLocation(@RequestBody LocationEntity location) {
		return locationService.addLocation(location);
	}
	
	@GetMapping("/location")
	public List<LocationEntity> listAllLocations() {
		return locationService.getAllLocation();
	}
}
