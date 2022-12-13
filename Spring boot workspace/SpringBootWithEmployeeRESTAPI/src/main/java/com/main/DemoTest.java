package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com") ///@Restcontroller, @Service, @Repository annotation enable 
@EnableJpaRepositories(basePackages = "com.repository")	// Enable Jpa repository features 
@EntityScan(basePackages = "com.bean")	// Enable @Entity class 
public class DemoTest {

	public static void main(String[] args) {
		SpringApplication.run(DemoTest.class, args);
		System.out.println("Server up!");
	}

}
