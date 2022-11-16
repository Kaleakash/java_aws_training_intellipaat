package com;

public abstract class Bike {
	int wheel;
	public Bike() {
		System.out.println("object created with empty");
	}
	public Bike(int x) {
		System.out.println("object created with parameter");
	}
	public abstract void speed();
	
	public void mailage() {
		System.out.println("50km/lt");
	}
}
