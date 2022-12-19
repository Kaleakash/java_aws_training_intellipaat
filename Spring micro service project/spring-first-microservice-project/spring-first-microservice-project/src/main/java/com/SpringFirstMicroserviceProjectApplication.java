package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class SpringFirstMicroserviceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstMicroserviceProjectApplication.class, args);
		System.out.println("First miro service project up");
	}

}
