package com.thirdspring.MyThirdSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thirdspring.MyThirdSpring.Service.TravellerService;
import com.thirdspring.MyThirdSpring.entity.MyTraveller;

@RestController
public class MyController {
	
	@Autowired
	TravellerService travellerService;
	
	@GetMapping("/welcome")
	public String helloWorld() {
		return "Hi Andrew. Good Afternoon.";
	}
	
	@PostMapping("/travellers")
	public MyTraveller postTravellers(@RequestBody MyTraveller traveller) {
		return travellerService.addTraveller(traveller);
	}
	
	@GetMapping("/travellers")
	public List<MyTraveller> getTravellers() {
		return travellerService.getAllTravellers();
	}
	
	@GetMapping("/travellers/{id}")
	public MyTraveller getTravellerById(@PathVariable Long id) {
		return travellerService.getTravellersById(id);
	}
	
	@GetMapping("/travellers/query")
	public MyTraveller getTravellerByName(@RequestParam(value = "travellerName", required = false) String name) {
		return travellerService.getTravellersByName(name);
	}
	
	@DeleteMapping("/travellers/{id}")
	public void deleteTravellerById(@PathVariable Long id) {
		travellerService.deleteTravellersById(id);
	}
}
