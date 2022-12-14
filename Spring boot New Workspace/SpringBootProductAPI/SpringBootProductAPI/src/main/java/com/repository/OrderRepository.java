package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

	@Query("select o from Order o where o.pid = :productId")
	public List<Order> findAllOrderByPId(@Param("productId") int pid);
}
