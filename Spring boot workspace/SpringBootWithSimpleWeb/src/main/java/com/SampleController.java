package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController			// @Controller + @ResponseBody
public class SampleController {
	// http://localhost:8080/sayHello
	@RequestMapping(value = "sayHello")
	public String sayHello() {
		return "Welcome to Spring boot with simple rest api";
	}
	// http://localhost:8080/sayHtml 
	@RequestMapping(value = "sayHtml",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<abc>Welcome to Spring boot </abc>";
	}
	// http://localhost:8080/sayPlain
	@RequestMapping(value = "sayPlain",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlain() {
		return "<abc>Welcome to Spring boot </abc>";
	}
	// http://localhost:8080/sayXml
	@RequestMapping(value = "sayXml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<abc>Welcome to Spring boot </abc>";
	}
}
