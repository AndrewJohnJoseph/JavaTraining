package com.thirdspring.MyThirdSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thirdspring.MyThirdSpring.Service.DomesticTravelService;
import com.thirdspring.MyThirdSpring.entity.MyDomesticTravel;

@RestController
public class MyDomesticTravelController {
	@Autowired
	DomesticTravelService dtravelService;
	
	@PreAuthorize("hasAuthority('developer')")
	@PostMapping("/domestictravel")
	public MyDomesticTravel postDomesticTravel(@RequestBody MyDomesticTravel dtravel) {
		return dtravelService.addDomesticTravel(dtravel);
	}
	
	@PreAuthorize("hasAuthority('developer')")
	@GetMapping("/domestictravel")
	public List<MyDomesticTravel> gettDomesticTravel() {
		return dtravelService.getAllDomesticTravellers();
	}
}
