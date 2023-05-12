package com.inpatient.tracker.login.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.inpatient.tracker.login.entity.LoginEntity;

@Repository
public interface ILoginRepo extends CrudRepository<LoginEntity, Long> {
	public LoginEntity findByLoginName(String loginName);
}
