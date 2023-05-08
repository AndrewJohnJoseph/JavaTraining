package com.thirdspring.MyThirdSpring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.thirdspring.MyThirdSpring.entity.MyTraveller;
import com.thirdspring.MyThirdSpring.repo.ITravellerRepo;


@Service
public class TravellerServiceImpl implements TravellerService{

	@Autowired
	ITravellerRepo travellerRepo;
	
	@Override
	public MyTraveller addTraveller(MyTraveller traveller) {
		return travellerRepo.save(traveller);
	}

	@Override
	public List<MyTraveller> getAllTravellers() {
		return (List<MyTraveller>)travellerRepo.findAll();
	}

	@Override
	public MyTraveller getTravellersById(long id) {
		return travellerRepo.findBytravellerId(id);
	}

	@Override
	public MyTraveller getTravellersByName(String name) {
		return travellerRepo.findBytravellerName(name);
	}

	@Override
	public void deleteTravellersById(long id) {
		travellerRepo.deleteById(id);
	}	
}
