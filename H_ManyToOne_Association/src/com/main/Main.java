package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.ProjectDetails;
import com.entities.ProjectEmployee;

public class Main {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ProjectEmployee.class);
		cfg.addAnnotatedClass(ProjectDetails.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		ProjectDetails p1 = new ProjectDetails();
		p1.setProjectID("PRO1213");
		p1.setProjectName("Banking");
		p1.setNumberOfEmp(23);
		p1.setProjectBudget(40);
		
		ProjectDetails p2 = new ProjectDetails();
		p2.setProjectID("PRO7766");
		p2.setProjectName("Media");
		p2.setNumberOfEmp(12);
		p2.setProjectBudget(67);
		
		ss.persist(p1);
		ss.persist(p2);
		
		
		ProjectEmployee emp1 = new ProjectEmployee(1001,"Shivani Bhoi","Development","Java Developer" ,p1);
		ProjectEmployee emp2 = new ProjectEmployee(1002,"Devendra Pardeshi","Testing","Team Lead",p1);
		ProjectEmployee emp3 = new ProjectEmployee(1003,"Minakshi Ahuja","Requirement","Analyzer",p1);
		ProjectEmployee emp4 = new ProjectEmployee(1004,"Satish Patil","Development","Front End",p2);
		ProjectEmployee emp5 = new ProjectEmployee(1005,"Santosh Bhoi","Testing","Team Lead",p2);
		ProjectEmployee emp6 = new ProjectEmployee(1006,"Dhruv Roy","Requirement","Analyzer",p1);

		ss.persist(emp1);
		ss.persist(emp2);
		ss.persist(emp3);
		ss.persist(emp4);
		ss.persist(emp5);
		ss.persist(emp6);
		
		List<ProjectEmployee> pro1 = new ArrayList<>();
		pro1.add(emp1);
		pro1.add(emp2);
		pro1.add(emp3);
		

		List<ProjectEmployee> pro2 = new ArrayList<>();
		pro1.add(emp4);
		pro1.add(emp5);
		pro1.add(emp6);
		
		tr.commit();
		ss.close();
		
		
		
	}
}
