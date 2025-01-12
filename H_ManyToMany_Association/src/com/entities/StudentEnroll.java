package com.entities;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class StudentEnroll {

	@Id
	private int studID;
	private String studName;
	private String studLocation;
	private int fee;
	
	@ManyToMany
	private List<CoursesDetails> cd;

	
	public StudentEnroll() {
		
	}

	public StudentEnroll(int studID, String studName, String studLocation, int fee, List<CoursesDetails> cd) {
		super();
		this.studID = studID;
		this.studName = studName;
		this.studLocation = studLocation;
		this.fee = fee;
		this.cd = cd;
	}

	@Override
	public String toString() {
		return "StudentEnroll [studID=" + studID + ", studName=" + studName + ", studLocation=" + studLocation
				+ ", fee=" + fee + ", cd=" + cd + "]";
	}

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudLocation() {
		return studLocation;
	}

	public void setStudLocation(String studLocation) {
		this.studLocation = studLocation;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	
	public List<CoursesDetails> getCd() {
		return cd;
	}

	public void setCd(List<CoursesDetails> cd) {
		this.cd = cd;
	} 
	
	
	
	
}
