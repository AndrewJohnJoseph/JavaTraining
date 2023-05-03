package com.thirdspring.MyThirdSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.thirdspring.MyThirdSpring.Service.DomesticTravelService;
import com.thirdspring.MyThirdSpring.entity.MyDomesticTravel;

public class MyDomesticTravelController {
	@Autowired
	DomesticTravelService dtravelService;
	
	@PostMapping("/foreigntravel")
	public MyDomesticTravel postForeignTravel(@RequestBody MyDomesticTravel dtravel) {
		return dtravelService.addDomesticTravel(dtravel);
	}
}
