package com;

public class AbstractExample {

	public static void main(String[] args) {
	
		Honda hh = new Honda();
			hh.color();// it own 
		hh.speed();	// abstract provided body in sub class 
		hh.mailage();	// super class method 
	}

}
