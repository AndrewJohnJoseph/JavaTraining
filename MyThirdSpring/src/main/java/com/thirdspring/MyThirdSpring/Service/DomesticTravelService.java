package com.thirdspring.MyThirdSpring.Service;

import java.util.List;

import com.thirdspring.MyThirdSpring.entity.MyDomesticTravel;
import com.thirdspring.MyThirdSpring.entity.MyTraveller;

public interface DomesticTravelService {
	public MyDomesticTravel addDomesticTravel(MyDomesticTravel dtraveller);
	public List<MyDomesticTravel> getAllDomesticTravellers();
}
