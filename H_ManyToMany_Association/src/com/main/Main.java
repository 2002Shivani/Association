package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.CoursesDetails;

import com.entities.StudentEnroll;

public class Main {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(StudentEnroll.class);
		cfg.addAnnotatedClass(CoursesDetails.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		
		CoursesDetails cd1 = new CoursesDetails();
		cd1.setCourseID(10005);
		cd1.setCourseName("Python Full Stack");
		cd1.setCourseFee(25000);
		cd1.setDuration(6);
		
		
		CoursesDetails cd2 = new CoursesDetails();
		cd2.setCourseID(20007);
		cd2.setCourseName("DevOps");
		cd2.setCourseFee(30000);
		cd2.setDuration(6);
		
		
		
		StudentEnroll stud1 = new StudentEnroll();
		stud1.setStudID(505);
		stud1.setStudName("Shivani Bhoi");
		stud1.setFee(20000);
		stud1.setStudLocation("Pune");
	
		
		StudentEnroll stud2 = new StudentEnroll();
		stud2.setStudID(507);
		stud2.setStudName("Devendra Pardeshi");
		stud2.setFee(25000);
		stud2.setStudLocation("Pune");
		
		
		
		StudentEnroll stud3 = new StudentEnroll();
		stud3.setStudID(508);
		stud3.setStudName("Satish Bhole");
		stud3.setFee(10000);
		stud3.setStudLocation("Pune");
		
		
		List<StudentEnroll> java = new ArrayList<StudentEnroll>();
		java.add(stud1);
		java.add(stud2);
		cd1.setStud(java);
		
		
		List<StudentEnroll> test = new ArrayList<StudentEnroll>();
		test.add(stud2);
		test.add(stud3);
		cd2.setStud(test);
		
		
		
		List<CoursesDetails> s1 = new ArrayList<CoursesDetails>();
		s1.add(cd1);
		stud1.setCd(s1);
		
		List<CoursesDetails> s2 = new ArrayList<CoursesDetails>();
		s2.add(cd1);
		s2.add(cd2);
		stud2.setCd(s2);
		
		
		List<CoursesDetails> s3 = new ArrayList<CoursesDetails>();
		s3.add(cd2);
		stud3.setCd(s3);
		
		ss.persist(stud1);
		ss.persist(stud2);
		ss.persist(stud3);
		ss.persist(cd1);
		ss.persist(cd2);
		
		tr.commit();
		
		
		ss.close();
		
		
		
		
		

	}

}

