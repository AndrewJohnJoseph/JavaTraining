package com.thirdspring.MyThirdSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thirdspring.MyThirdSpring.Service.ForeignTravelService;
import com.thirdspring.MyThirdSpring.entity.MyForeignTravel;

@RestController
public class MyForeignTravelController {
	@Autowired
	ForeignTravelService ftravelService;
	
	@PreAuthorize("hasAuthority('FC')")
	@PostMapping("/foreigntravel")
	public MyForeignTravel postForeignTravel(@RequestBody MyForeignTravel ftravel) {
		return ftravelService.addForeignTravel(ftravel);
	}	
}
