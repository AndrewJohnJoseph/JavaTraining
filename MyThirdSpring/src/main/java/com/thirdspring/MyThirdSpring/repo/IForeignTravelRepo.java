package com.thirdspring.MyThirdSpring.repo;

import org.springframework.data.repository.CrudRepository;

import com.thirdspring.MyThirdSpring.entity.MyForeignTravel;

public interface IForeignTravelRepo  extends CrudRepository<MyForeignTravel, Long> {

}
