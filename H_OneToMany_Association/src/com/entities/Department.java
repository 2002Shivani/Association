package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private int deptId;
	private String deptName;
	private int deptManagerNo;
	private String deptLocation;
	
	@OneToMany(mappedBy = "DeptID")
	private  List<Employee> Emp;

	public Department() {
		
	}

	public Department(int deptId, String deptName, int deptManagerNo, String deptLocation, List<Employee> emp) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptManagerNo = deptManagerNo;
		this.deptLocation = deptLocation;
		Emp = emp;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptManagerNo() {
		return deptManagerNo;
	}

	public void setDeptManagerNo(int deptManagerNo) {
		this.deptManagerNo = deptManagerNo;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

	public List<Employee> getEmp() {
		return Emp;
	}

	public void setEmp(List<Employee> emp) {
		Emp = emp;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptManagerNo=" + deptManagerNo
				+ ", deptLocation=" + deptLocation + ", Emp=" + Emp + "]";
	}
	
	

}
