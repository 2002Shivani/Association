package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	private int laptopId;
	private String laptopCompany;
	private String laptopProsessor;
	private int laptopRam;
	public Laptop() {
		super();
	
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopCompany=" + laptopCompany + ", laptopProsessor="
				+ laptopProsessor + ", laptopRam=" + laptopRam + "]";
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopCompany() {
		return laptopCompany;
	}
	public void setLaptopCompany(String laptopCompany) {
		this.laptopCompany = laptopCompany;
	}
	public String getLaptopProsessor() {
		return laptopProsessor;
	}
	public void setLaptopProsessor(String laptopProsessor) {
		this.laptopProsessor = laptopProsessor;
	}
	public int getLaptopRam() {
		return laptopRam;
	}
	public void setLaptopRam(int laptopRam) {
		this.laptopRam = laptopRam;
	}
	public Laptop(int laptopId, String laptopCompany, String laptopProsessor, int laptopRam) {
		super();
		this.laptopId = laptopId;
		this.laptopCompany = laptopCompany;
		this.laptopProsessor = laptopProsessor;
		this.laptopRam = laptopRam;
	}
	
	
	
}
