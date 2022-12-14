package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Product {
@Id
private int pid;
private String pname;
private float price;
private int quanity;
private String url;
@OneToMany
@JoinColumn(name = "pid",referencedColumnName = "pid")
private List<Order> listOfOrder;


public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public Product(int pid, String pname, float price, int quanity, String url, List<Order> listOfOrder) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
	this.quanity = quanity;
	this.url = url;
	this.listOfOrder = listOfOrder;
}

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQuanity() {
	return quanity;
}
public void setQuanity(int quanity) {
	this.quanity = quanity;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public List<Order> getListOfOrder() {
	return listOfOrder;
}
public void setListOfOrder(List<Order> listOfOrder) {
	this.listOfOrder = listOfOrder;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", quanity=" + quanity + ", url=" + url
			+ ", listOfOrder=" + listOfOrder + "]";
}

}
