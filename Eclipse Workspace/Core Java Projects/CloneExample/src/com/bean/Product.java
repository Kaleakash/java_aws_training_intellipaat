package com.bean;

public class Product implements Cloneable{
private String name;
private float price;

public Product() {
	super();
	System.out.println("empty constructor");
}

public Product(String name, float price) {
	super();
	this.name = name;
	this.price = price;
	System.out.println("parameter constructor");
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + "]";
}

public Product getClone() {
	Product p = null;
		try {
		Object obj= clone();
		p = (Product)obj;			// down level type casting 
		}catch(Exception e) {}
		return p;
	}
}




