package com.inpatient.tracker.doctor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhsdoctor")
public class DoctorEntity {
	
				public DoctorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



				public DoctorEntity(Long doctorId, String name, String email_id, String contact_No, String gender,
						String dateofjoining) {
					super();
					doctorid = doctorId;
					Name = name;
					Email_id = email_id;
					Contact_No = contact_No;
					Gender = gender;
					Dateofjoining = dateofjoining;
				}



				@Id
				@GeneratedValue(strategy = GenerationType.AUTO)
				private Long doctorid;
				
				@Column(nullable = false)
				private String Name;
				
				@Column(nullable = false)
				private String Email_id;
				
				@Column(nullable = true)
				private String Contact_No;

				@Column(nullable = true)
				private String Gender;
				
				@Column(nullable = true)
				private String Dateofjoining;
				
				@Override
				public String toString() {
					return "Doctor [Doctorid=" + doctorid + ", name=" + Name + ", email_id=" + Email_id
							+ ", ContactNo=" + Contact_No + ", Gender=" + Gender + ", Dateofjoining="
							+ Dateofjoining + ",]";
				}
				
				public Long getDoctorid() {
					return doctorid;
				}



				public void setDoctorid(Long doctorId) {
					doctorid = doctorId;
				}



				public String getName() {
					return Name;
				}



				public void setName(String name) {
					this.Name = name;
				}



				public String getEmail_id() {
					return Email_id;
				}



				public void setEmail_id(String email_id) {
					Email_id = email_id;
				}



				public String getContact_No() {
					return Contact_No;
				}



				public void setContact_No(String contact_No) {
					Contact_No = contact_No;
				}



				public String getGender() {
					return Gender;
				}



				public void setGender(String gender) {
					Gender = gender;
				}



				public String getDateofjoining() {
					return Dateofjoining;
				}



				public void setDateofjoining(String dateofjoining) {
					Dateofjoining = dateofjoining;
				}

				
	}

