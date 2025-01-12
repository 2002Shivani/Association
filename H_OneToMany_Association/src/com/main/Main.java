package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Department;
import com.entities.Employee;

public class Main {

	public static void main(String[] args) {
		

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tranc = session.beginTransaction();
		
		
		Department dept1 = new Department();
		
		dept1.setDeptId(1001);
		dept1.setDeptName("Software Developer");
		dept1.setDeptManagerNo(5);
		dept1.setDeptLocation("5th floor Terminal-I");
		
		session.persist(dept1);
		
		Department dept2 = new Department();
		dept2.setDeptId(1002);
		dept2.setDeptName("HR");
		dept2.setDeptManagerNo(8);
		dept2.setDeptLocation("6th floor Terminal-I");
		session.persist(dept2);
		
		
		Employee emp1 = new Employee();
		emp1.setEmpId(121210);
		emp1.setEmpName("Shivani Bhoi");
		emp1.setEmpPosition("Java Developer");
		emp1.setEmpEmail("abv@gmail.com");
		emp1.setEmpMobileNumber(6724567856L);
		emp1.setDeptID(dept1);
		session.persist(emp1);
		
		Employee emp2 = new Employee();
		emp2.setEmpId(121211);
		emp2.setEmpName("Devendra Pardeshi");
		emp2.setEmpPosition("Testing");
		emp2.setEmpEmail("bvg@gmail.com");
		emp2.setEmpMobileNumber(7866453678L);
		emp2.setDeptID(dept1);
		
		session.persist(emp2);
		
		
		Employee emp3 = new Employee();
		emp3.setEmpId(131314);
		emp3.setEmpName("Durga Telang");
		emp3.setEmpPosition("IT HR");
		emp3.setEmpEmail("inh.hr@gmail.com");
		emp3.setEmpMobileNumber(6724567856L);
		emp3.setDeptID(dept2);
		session.persist(emp3);
		
		
		List<Employee> software = new ArrayList<Employee>();
		software.add(emp1);
		software.add(emp2);
		dept1.setEmp(software);
		
		List<Employee> hr = new ArrayList<Employee>();
		hr.add(emp3);
		dept2.setEmp(hr);
		
		
		
		tranc.commit();
		session.close();
	}

}
