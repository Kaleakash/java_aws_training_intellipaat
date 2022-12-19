package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer    // enable eureka server 
public class SpringEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerApplication.class, args);
		System.out.println("Eureka Server Up!");
	}

}
