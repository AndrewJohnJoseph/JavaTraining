package com.inpatient.tracker.patient.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "nhsPatient")
public class Patient{
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Long patientId, String patientname, String fathername, String address, int contact, String gender,
			int age, String bloodgroup) {
		super();
		patientid = patientId;
		patientName = patientname;
		fatherName = fathername;
		this.address = address;
		Contact = contact;
		this.gender = gender;
		this.age = age;
		this.bloodGroup = bloodgroup;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientid;
	
	@Column(nullable = false)
	private String patientName;
	
	@Column(nullable = false)
	private String fatherName;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private int Contact;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private int age;
	
	@Override
	public String toString() {
		return "Patient[Patientid=" + patientid + ", PatientName=" + patientName 
				+ ",FatherName=" + fatherName + ",address=" + address + ",Contact=" + Contact 
				+ ",gender=" + gender + ",age=" + age + ",Bloodgroup=" +bloodGroup+",]";
        }
	
	@Column(nullable = false)
	private String bloodGroup;

	public Long getPatientid() {
		return patientid;
	}

	public void setPatientid(Long patientId) {
		patientid = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientname) {
		patientName = patientname;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fathername) {
		fatherName = fathername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContact() {
		return Contact;
	}

	public void setContact(int contact) {
		Contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodgroup() {
		return bloodGroup;
	}

	public void setBloodgroup(String bloodgroup) {
		bloodGroup = bloodgroup;
	}	
}