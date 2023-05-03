package com.thirdspring.MyThirdSpring.repo;

import org.springframework.data.repository.CrudRepository;

import com.thirdspring.MyThirdSpring.entity.MyDomesticTravel;

public interface IDomesticTravelRepo  extends CrudRepository<MyDomesticTravel, Long> {

}
