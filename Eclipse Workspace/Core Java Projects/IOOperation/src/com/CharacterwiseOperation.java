package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterwiseOperation {

	public static void main(String[] args) throws Exception{
//		// source : keyboard, destination : console 
////	InputStreamReader isr = new InputStreamReader(System.in);	
////	BufferedReader br = new BufferedReader(isr);
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	System.out.println("enter the id");
//	int id = Integer.parseInt(br.readLine());
//	System.out.println("enter the name");
//	String name = br.readLine();
//	System.out.println("id is "+id);
//	System.out.println("name is "+name);
		
//		// source : keyboard and destination : file 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		FileWriter fw = new FileWriter("xyz.txt");
//		System.out.println("Enter the data");
//		int ch;
//		while((ch=br.read())!= '@') {
//			fw.write(ch);
//		}
//		//fw.flush();
//		fw.close();
		
//		// source : keyboard and destination : file 
//				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				FileWriter fw = new FileWriter("mno.txt");
//				System.out.println("Enter the data");
//				String data="";
//				do{
//					data = br.readLine();
//					fw.write(data);
//				}while((!data.equals("exit")));
//				fw.close();
		
		// source : file destination : file 
		FileReader fr = new FileReader("abc.txt");
		FileWriter fw = new FileWriter("demo.doc");
		int ch;
		while((ch=fr.read())!= -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
