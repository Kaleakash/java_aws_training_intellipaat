package com;

public class Tvs extends Bike {

	public void color() {
		System.out.println("Black");
	}

	@Override
	public void speed() {			// merge super class method and sub class method 
		super.speed();     // calling super class speed method 
		System.out.println("10km/hr");
	}
}
