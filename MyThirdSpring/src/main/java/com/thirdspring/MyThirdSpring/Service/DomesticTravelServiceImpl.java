package com.thirdspring.MyThirdSpring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdspring.MyThirdSpring.entity.MyDomesticTravel;
import com.thirdspring.MyThirdSpring.entity.MyTraveller;
import com.thirdspring.MyThirdSpring.repo.IDomesticTravelRepo;

@Service
public class DomesticTravelServiceImpl implements DomesticTravelService {
	@Autowired
	IDomesticTravelRepo dtravelRepo;

	@Override
	public MyDomesticTravel addDomesticTravel(MyDomesticTravel dtraveller) {
		// TODO Auto-generated method stub
		return dtravelRepo.save(dtraveller);
	}
	
	@Override
	public List<MyDomesticTravel> getAllDomesticTravellers() {
		return (List<MyDomesticTravel>)dtravelRepo.findAll();
	}
}
