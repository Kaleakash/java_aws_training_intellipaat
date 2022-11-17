package com;

public class Server implements Team1,Team2{

	public int sum(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	
	public void ownMethod() {
		System.out.println("it my own method");
	}
}
