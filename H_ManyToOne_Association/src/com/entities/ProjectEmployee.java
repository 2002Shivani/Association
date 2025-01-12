package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class ProjectEmployee {

	@Id
	private int empID;
	private String empName;
	private String empDept;
	private String empPosition;
	
	@ManyToOne
	private ProjectDetails project;

	public ProjectEmployee() {
		
	}
	

	public ProjectEmployee(int empID, String empName, String empDept, String empPosition, ProjectDetails project) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDept = empDept;
		this.empPosition = empPosition;
		this.project = project;
	}



	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpPosition() {
		return empPosition;
	}

	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}

	public ProjectDetails getProject() {
		return project;
	}

	public void setProject(ProjectDetails project) {
		this.project = project;
	}


	@Override
	public String toString() {
		return "ProjectEmployee [empID=" + empID + ", empName=" + empName + ", empDept=" + empDept + ", empPosition="
				+ empPosition + ", project=" + project + "]";
	}
	
	
	
	
}
