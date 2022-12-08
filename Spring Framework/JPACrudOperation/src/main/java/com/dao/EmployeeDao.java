package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
	
	public int deleteEmployee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");		// it is like a Connection in jdbc 
		EntityManager manager = emf.createEntityManager();		// Statement or PreparedStatement 
		EntityTransaction tran = manager.getTransaction();
		Employee emp= manager.find(Employee.class, id);	//1st parameter entity reference and 2nd parameter primary key column 
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
					manager.remove(emp);		// delete query 
			tran.commit();
			return 1;
		}
	}
	public int updateEmployee(Employee e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");		// it is like a Connection in jdbc 
		EntityManager manager = emf.createEntityManager();		// Statement or PreparedStatement 
		EntityTransaction tran = manager.getTransaction();
		Employee emp= manager.find(Employee.class, e.getId());	//1st parameter entity reference and 2nd parameter primary key column 
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
					emp.setSalary(e.getSalary());
					manager.merge(emp);				// update query 
			tran.commit();
			return 1;
		}
	}
	
	public Employee fineEmployee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");		// it is like a Connection in jdbc 
		EntityManager manager = emf.createEntityManager();		// Statement or PreparedStatement 
		Employee emp= manager.find(Employee.class, id);	//1st parameter entity reference and 2nd parameter primary key column 
		return emp;
	}
	
	public List<Employee> findAllEmployee() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");		// it is like a Connection in jdbc 
		EntityManager manager = emf.createEntityManager();		// Statement or PreparedStatement
		Query qry= manager.createQuery("select emp from Employee emp");
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	public List<Employee> findAllEmployeeBySalary() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");		// it is like a Connection in jdbc 
		EntityManager manager = emf.createEntityManager();		// Statement or PreparedStatement
		Query qry= manager.createQuery("select emp from Employee emp where emp.salary > 12000");
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	public List<Employee> findAllEmployeeBySalary(float salary) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");		// it is like a Connection in jdbc 
		EntityManager manager = emf.createEntityManager();		// Statement or PreparedStatement
		Query qry= manager.createQuery("select emp from Employee emp where emp.salary > :sal");  // label query 
		qry.setParameter("sal", salary);
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
}
