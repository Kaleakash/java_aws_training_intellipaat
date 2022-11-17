package com;

public class DemoTest {

	public static void main(String[] args) {
		Server ss = new Server();
		ss.sum(100, 200);
		ss.sub(200, 50);
		ss.ownMethod();
		
		Team1 tt1 = new Server();
		System.out.println(tt1.sum(1, 2));
		//System.err.println(tt1.sub(10, 5));
		
		Team2 tt2 = new Server();
		System.out.println(tt2.sub(200, 50));
		//System.out.println(tt2.sum(100,200));
	}

}
