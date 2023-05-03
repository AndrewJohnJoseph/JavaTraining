package com.thirdspring.MyThirdSpring.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "my_domestictravel")
public class MyDomesticTravel {

	public MyDomesticTravel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MyDomesticTravel(Long localid, String location, long noofpeople, MyTraveller trtourist) {
		super();
		this.localid = localid;
		this.location = location;
		this.noofpeople = noofpeople;
		this.trtourist = trtourist;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long localid;
	
	@Column(nullable = false)
	private String location;

	@Column(nullable = false)
	private long noofpeople;	

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="travellercode", referencedColumnName="travellerId")
	private MyTraveller trtourist;

	public Long getLocalid() {
		return localid;
	}


	public void setLocalid(Long localid) {
		this.localid = localid;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public long getNoofpeople() {
		return noofpeople;
	}


	public void setNoofpeople(long noofpeople) {
		this.noofpeople = noofpeople;
	}


	public MyTraveller getTrtourist() {
		return trtourist;
	}


	public void setTrtourist(MyTraveller trtourist) {
		this.trtourist = trtourist;
	}


	@Override
	public String toString() {
		return "MyDomesticTravel [localid=" + localid + ", location=" + location + ", noofpeople=" + noofpeople
				+ ", trtourist=" + trtourist + "]";
	}
	
	
}
