package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
public class SpringBootProductApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductApiApplication.class, args);
		System.out.println("Server Up");
	}

}
