package com.thirdspring.MyThirdSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdspring.MyThirdSpring.entity.MyForeignTravel;
import com.thirdspring.MyThirdSpring.repo.IForeignTravelRepo;

public class ForeignTravelServiceImpl implements ForeignTravelService {
	
	@Autowired
	IForeignTravelRepo ftravelRepo;

	@Override
	public MyForeignTravel addForeignTravel(MyForeignTravel ftraveller) {
		// TODO Auto-generated method stub
		return ftravelRepo.save(ftraveller);
	}

}
