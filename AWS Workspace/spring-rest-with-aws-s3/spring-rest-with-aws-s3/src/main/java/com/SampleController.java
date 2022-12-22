package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aws")
public class SampleController {

	// http://localhost:8080/aws/sayHello
	
	@GetMapping(value="sayHello")
	public String greeting() {
		return "Welcome to Spring boot with AWS created by Akash Kale";
	}
}
