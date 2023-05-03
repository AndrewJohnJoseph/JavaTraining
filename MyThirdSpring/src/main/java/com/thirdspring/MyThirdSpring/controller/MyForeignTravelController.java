package com.thirdspring.MyThirdSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.thirdspring.MyThirdSpring.Service.ForeignTravelService;
import com.thirdspring.MyThirdSpring.entity.MyForeignTravel;

public class MyForeignTravelController {
	@Autowired
	ForeignTravelService ftravelService;
	
	@PostMapping("/foreigntravel")
	public MyForeignTravel postForeignTravel(@RequestBody MyForeignTravel ftravel) {
		return ftravelService.addForeignTravel(ftravel);
	}	
}
