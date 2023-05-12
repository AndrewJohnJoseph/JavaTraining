package com.inpatient.tracker.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class LoginEntity {
	
	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginEntity(Long loginId, String loginName, String password, String surname, String forename, String gender,
			String roles) {
		super();
		this.loginId = loginId;
		this.loginName = loginName;
		this.password = password;
		this.surname = surname;
		this.forename = forename;
		this.gender = gender;
		this.roles = roles;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long loginId;
	
	@Column(nullable = false,unique = true)
	private String loginName;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String surname;
	
	@Column(nullable = false)
	private String forename;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private String roles;

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "LoginEntity [loginId=" + loginId + ", loginName=" + loginName + ", password=" + password + ", surname="
				+ surname + ", forename=" + forename + ", gender=" + gender + ", roles=" + roles + "]";
	}
	
}
