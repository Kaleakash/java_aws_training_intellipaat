package com;

public class MethodOverridingExample {

	public static void main(String[] args) {
	Pulsar pu = new Pulsar();
	pu.color();
	pu.speed();
	
	Honda hh = new Honda();
	hh.color();
	hh.speed();

	Tvs tt = new Tvs();
	tt.color();
	tt.speed();
	}

}
