package com.entity;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DemoTest {

	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARelationship");
	EntityManager manager = emf.createEntityManager();
	EntityTransaction tran = manager.getTransaction();
	
	// insert into trainer table 
//	tran.begin();
//	Trainer t1 = new Trainer();
//	t1.setTid(3);
//	t1.setName("Ramesh");
//	t1.setTech("Angular");
//	manager.persist(t1);
//	tran.commit();
//	System.out.println("Trainer record saved...");
	
	// insert into student table 
//	tran.begin();
//	Student s1 = new Student();
//	s1.setSid(103);
//	s1.setSname("Meeta");
//	s1.setAge(25);
//	//s1.setTsid(5);
//	manager.persist(s1);
//	tran.commit();
//	System.out.println("Student record saved successfully");
	
//	// Retrieve trainer records 
//	Query qry = manager.createQuery("select t from Trainer t");
//	List<Trainer> ll = qry.getResultList();
//	Iterator<Trainer> li = ll.iterator();
//	while(li.hasNext()) {
//		Trainer t = li.next();
//		System.out.println(t);
//	}
	
	// Retrieve student records 
		Query qry = manager.createQuery("select s from Student s");
		List<Student> ll = qry.getResultList();
		Iterator<Student> li = ll.iterator();
		while(li.hasNext()) {
			Student s = li.next();
			System.out.println(s);
		}
	}

}
