package com;

import java.io.Closeable;
import java.io.IOException;

class A implements Closeable{
	void dis() {
		System.out.println("A class method");
	}
	@Override
	public void close() throws IOException {
			System.out.println("close method");
	}
}
public class TryWithCustomResoure {

	public static void main(String[] args) {
	
		try(
				A obj = new A();	
			){
				System.out.println("This is try block");
					
				obj.dis();
		}catch (Exception e) {
			
		}
	}

}
