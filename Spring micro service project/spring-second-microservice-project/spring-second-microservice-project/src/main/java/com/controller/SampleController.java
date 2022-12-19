package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")
public class SampleController {

	@GetMapping(value = "client")
	public String greeting() {
		return "Welcome to Spring boot with micro service second project";
	}
}
