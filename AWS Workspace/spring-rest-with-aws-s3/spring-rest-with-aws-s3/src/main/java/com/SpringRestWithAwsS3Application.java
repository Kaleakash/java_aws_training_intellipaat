package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringRestWithAwsS3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestWithAwsS3Application.class, args);
		System.out.println("Server up!");
	}

}
