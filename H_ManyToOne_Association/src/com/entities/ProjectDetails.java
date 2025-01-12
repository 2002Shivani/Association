package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ProjectDetails {

	@Id
	private String projectID;
	private String projectName;
	private int projectBudget;
	private int numberOfEmp;
	
	@OneToMany(mappedBy = "project")
	private List<ProjectEmployee> emp;

	public ProjectDetails() {
		
	}

	public ProjectDetails(String projectID, String projectName, int projectBudget, int numberOfEmp,
			List<ProjectEmployee> emp) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.projectBudget = projectBudget;
		this.numberOfEmp = numberOfEmp;
		this.emp = emp;
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectBudget() {
		return projectBudget;
	}

	public void setProjectBudget(int projectBudget) {
		this.projectBudget = projectBudget;
	}

	public int getNumberOfEmp() {
		return numberOfEmp;
	}

	public void setNumberOfEmp(int numberOfEmp) {
		this.numberOfEmp = numberOfEmp;
	}

	public List<ProjectEmployee> getEmp() {
		return emp;
	}

	public void setEmp(List<ProjectEmployee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectID=" + projectID + ", projectName=" + projectName + ", projectBudget="
				+ projectBudget + ", numberOfEmp=" + numberOfEmp + ", emp=" + emp + "]";
	}
	
	
	
	
}
