package com.bean;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		// auto increment 
	private int oid;
	@Column(name="numberofquanity")
	private int numberOfQuanity;		// number_of_quanity 
	@Column(name="orderdate")
	private LocalDate orderDate;
	private int pid;
	
	@OneToOne(cascade = CascadeType.ALL)					// while placing the order we need to provide address details. 
	@JoinColumn(name = "oid",referencedColumnName = "aid")
	private Address add;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int oid, int numberOfQuanity, LocalDate orderDate, int pid, Address add) {
		super();
		this.oid = oid;
		this.numberOfQuanity = numberOfQuanity;
		this.orderDate = orderDate;
		this.pid = pid;
		this.add = add;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getNumberOfQuanity() {
		return numberOfQuanity;
	}
	public void setNumberOfQuanity(int numberOfQuanity) {
		this.numberOfQuanity = numberOfQuanity;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", numberOfQuanity=" + numberOfQuanity + ", orderDate=" + orderDate + ", pid="
				+ pid + ", add=" + add + "]";
	}
	
	
}
