package com.inpatient.tracker.admission.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inpatient.tracker.doctor.entity.DoctorEntity;
import com.inpatient.tracker.location.entity.LocationEntity;
import com.inpatient.tracker.patient.entity.Patient;

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
@Table(name = "nhsadmission")
public class Admission {

			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private Long admissionid;
			
			@OneToOne(cascade = CascadeType.MERGE)
			@JoinColumn(name = "patientid", referencedColumnName = "patientid")
			private Patient patient;
			
			@OneToOne(cascade = CascadeType.MERGE)
			@JoinColumn(name = "doctorid", referencedColumnName = "doctorid")
			private DoctorEntity doctor;
			
			@OneToOne(cascade = CascadeType.MERGE)
			@JoinColumn(name = "locationid", referencedColumnName = "id")
			private LocationEntity location;

			@Column(nullable = false)
			@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
			private Date admissiondate;
			
			@Override
			public String toString() {
				return "Admission [admissionid=" + admissionid + ", patientid=" + patient.toString() + ", doctorid=" + doctor.toString()
						+ ", locationid=" + location.toString() + ", admissiondate=" + admissiondate + ", expecteddischargedate="
						+ expecteddischargedate + ", lengthofstay=" + lengthofstay + ", actualdischargedate="
						+ actualdischargedate + "]";
			}

			
			@Column(nullable = false)
			@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
			private Date expecteddischargedate;
			
			@Column(nullable = false)
			private Long lengthofstay;

			@Column(nullable = true)
			@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
			private Date actualdischargedate;

			public Long getAdmissionid() {
				return admissionid;
			}

			public void setAdmissionid(Long admissionid) {
				this.admissionid = admissionid;
			}

			public Patient getPatient() {
				return patient;
			}

			public void setPatient(Patient patId) {
				this.patient = patId;
			}

			public DoctorEntity getDoctor() {
				return doctor;
			}

			public void setDoctor(DoctorEntity doc) {
				this.doctor = doc;
			}

			public LocationEntity getLocation() {
				return location;
			}

			public void setLocation(LocationEntity loc) {
				this.location = loc;
			}

			public Date getAdmissiondate() {
				return admissiondate;
			}

			public void setAdmissiondate(Date admissiondate) {
				this.admissiondate = admissiondate;
			}

			public Date getExpecteddischargedate() {
				return expecteddischargedate;
			}

			public void setExpecteddischargedate(Date expecteddischargedate) {
				this.expecteddischargedate = expecteddischargedate;
			}

			public Long getLengthofstay() {
				return lengthofstay;
			}

			public void setLengthofstay(Long lengthofstay) {
				this.lengthofstay = lengthofstay;
			}

			public Date getActualdischargedate() {
				return actualdischargedate;
			}

			public void setActualdischargedate(Date actualdischargedate) {
				this.actualdischargedate = actualdischargedate;
			}

			
}

