package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Laptop;
import com.entities.Student;

public class Main {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		
		System.out.println("Application Running.....");
		Student stud = new Student();
		Laptop lap = new Laptop();
		
		lap.setLaptopId(12345);
		lap.setLaptopCompany("HP");
		lap.setLaptopProsessor("i3");
		lap.setLaptopRam(8);
		
		session.persist(lap);
		
		stud.setStudId(908);
		stud.setStudName("Shivani");
		stud.setBatch("C-197");
		stud.setMobileNumber(6578445678L);
		stud.setLaptop(lap);
		
		System.out.println("Data Inserted......");
		session.persist(stud);
		tran.commit();

	}

}
