package com.thirdspring.MyThirdSpring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thirdspring.MyThirdSpring.entity.MyTraveller;

@Repository
public interface ITravellerRepo extends CrudRepository<MyTraveller, Long> {
	public MyTraveller findBytravellerName(String travellerName);
	public MyTraveller findBytravellerId(Long travellerid);
	public void deleteById(Long travellerid);
}
