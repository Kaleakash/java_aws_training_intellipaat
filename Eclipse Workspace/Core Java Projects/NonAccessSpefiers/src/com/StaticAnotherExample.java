package com;

public class StaticAnotherExample {

	public static void main(String[] args) {
			Info obj1 = new Info();
				Info obj2 = new Info();
					obj1.a=100;
						Info.b=200;
							obj1.b=300;
		
							obj2.a=400;
								Info.b=500;
									obj2.b=600;
		
		obj1.dis();			//a =100			b =600
		obj2.dis();			//a =400			b =600

	}

}
