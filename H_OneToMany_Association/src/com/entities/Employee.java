package com.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	private String empPosition;
	private String empEmail;
	private long empMobileNumber;
	
	@ManyToOne
	private Department DeptID;

	public Employee() {
		
	}

	public Employee(int empId, String empName, String empPosition, String empEmail, long empMobileNumber,
			Department deptID) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPosition = empPosition;
		this.empEmail = empEmail;
		this.empMobileNumber = empMobileNumber;
		DeptID = deptID;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPosition() {
		return empPosition;
	}

	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public long getEmpMobileNumber() {
		return empMobileNumber;
	}

	public void setEmpMobileNumber(long empMobileNumber) {
		this.empMobileNumber = empMobileNumber;
	}

	public Department getDeptID() {
		return DeptID;
	}

	public void setDeptID(Department deptID) {
		DeptID = deptID;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPosition=" + empPosition + ", empEmail="
				+ empEmail + ", empMobileNumber=" + empMobileNumber + ", DeptID=" + DeptID + "]";
	}
	
	
	
	
}
