package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Employee;

public class EmployeeDao {

	public int storeEmployee(Employee emp) {
		// Class.forName("DriverName");
		try {
		// Connction con = DriverManager.getConnection(url,username,password);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");		// it is like a Connection in jdbc 
		// PreparedStatement = con.preparedStatement("insert query")
		EntityManager manager = emf.createEntityManager();		// Statement or PreparedStatement 
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
				manager.persist(emp);       // insert Query or save 
		tran.commit();
		return 1;
		//tran.rollback();	
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
		
	}
}
