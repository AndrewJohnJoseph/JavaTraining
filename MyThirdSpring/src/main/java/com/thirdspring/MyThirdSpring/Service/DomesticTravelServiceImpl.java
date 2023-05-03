package com.thirdspring.MyThirdSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdspring.MyThirdSpring.entity.MyDomesticTravel;
import com.thirdspring.MyThirdSpring.repo.IDomesticTravelRepo;

public class DomesticTravelServiceImpl implements DomesticTravelService {
	@Autowired
	IDomesticTravelRepo dtravelRepo;

	@Override
	public MyDomesticTravel addDomesticTravel(MyDomesticTravel dtraveller) {
		// TODO Auto-generated method stub
		return dtravelRepo.save(dtraveller);
	}
}
