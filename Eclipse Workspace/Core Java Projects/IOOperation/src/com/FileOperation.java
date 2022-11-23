package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOperation {

	public static void main(String[] args) {
//		FileInputStream fis=null;
//		FileOutputStream fos=null;
//
//		try {
//			fis = new FileInputStream("mno.txt");
//			fos = new FileOutputStream("myfile.txt");
//			int ch;
//			while((ch = fis.read()) != -1) {
//				fos.write(ch);
//			}
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}finally {
//			try {
//			fis.close();
//			fos.close();
//			}catch(Exception e) {}
//		}
		try(
				FileInputStream fis = new FileInputStream("mno.txt");
				FileOutputStream fos = new FileOutputStream("mnoinfo.txt");
		){
			int ch;
			while((ch = fis.read()) != -1) {
				fos.write(ch);
			}
		}catch (Exception e) {
	
		}
	}

}
