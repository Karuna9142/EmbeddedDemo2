package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Address a1 = new Address();
		a1.setStreet("piskamore"); a1.setCity("Ranchi"); a1.setState("Jharkhand"); a1.setPincode(835214);
		
		Teacher t1 = new Teacher();
		t1.setId(101);t1.setName("Karuna Mishra");t1.setSalary(70000); t1.setAdd(a1);
		
		s.save(t1);
		t.commit();
		s.close();

	}

}
