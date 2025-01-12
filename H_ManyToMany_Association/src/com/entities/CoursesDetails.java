package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class CoursesDetails {

	
	@Id
	private  int courseID;
	private String courseName;
	private int courseFee;
	private int duration;
	
	@ManyToMany(mappedBy = "cd")
	private List<StudentEnroll> stud;

	public CoursesDetails() {
		
	}

	public CoursesDetails(int courseID, String courseName, int courseFee, int duration,
			List<StudentEnroll> stud) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.duration = duration;
		this.stud = stud;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	
	public List<StudentEnroll> getStud() {
		return stud;
	}

	public void setStud(List<StudentEnroll> stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "CoursesDetails [courseID=" + courseID + ", courseName=" + courseName + ", courseFee=" + courseFee
				+ ", duration=" + duration + ", stud=" + stud + "]";
	}
	
	
	
	
}
