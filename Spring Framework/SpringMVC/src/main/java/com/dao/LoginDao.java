package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Login;



@Repository
public class LoginDao {

	/*
	 * 1st options 
	 * 
	 * @Autowired 
	 * DataSource ds;
	 * 
	 * 2nd options 
	 * @Autowired 
	 * JdbcTemplate jdbcTemplate
	 */
	
	@Autowired
	EntityManagerFactory emf;
	
	public int checkLoginDetails(Login login) {
		//EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("abc");
		System.out.println(login);
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select l from Login l where l.email = :email and l.password = :password");
		qry.setParameter("email", login.getEmail());
		qry.setParameter("password", login.getPassword());
		List<Login> ll = qry.getResultList();
		System.out.println(ll);
		return ll.size();
	}
}
