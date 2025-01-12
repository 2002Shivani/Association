package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int studId;
	private String studName;
	private String batch;
	private long mobileNumber;
	
	@OneToOne
	private Laptop laptop;
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", batch=" + batch + ", mobileNumber="
				+ mobileNumber + ", laptop=" + laptop + "]";
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Student(int studId, String studName, String batch, long mobileNumber, Laptop laptop) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.batch = batch;
		this.mobileNumber = mobileNumber;
		this.laptop = laptop;
	}

	public Student() {
		super();
	}


	
	

}
