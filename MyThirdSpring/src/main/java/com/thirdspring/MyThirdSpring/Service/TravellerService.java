package com.thirdspring.MyThirdSpring.Service;

import java.util.List;

import com.thirdspring.MyThirdSpring.entity.MyTraveller;

public interface TravellerService {
	public MyTraveller addTraveller(MyTraveller traveller);
	
	public List<MyTraveller> getAllTravellers();
	public MyTraveller getTravellersById(long id);
	public MyTraveller getTravellersByName(String name);
	public void deleteTravellersById(long id);
}
