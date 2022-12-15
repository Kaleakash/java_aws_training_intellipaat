package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.repository.ProductRepository;
import com.service.ProductService;


// http://localhost:8080/products/*

@RestController
@RequestMapping("products")
@CrossOrigin				// Enable cors features 
public class ProductController {

	@Autowired
	ProductService productService;
	
	//@RequestMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
		return productService.storeProdcut(product);
	}
	
	@GetMapping(value = "findAllProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProduct() {
		return productService.getAllProductDetails();
	}
	

		@PutMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateProduct(@RequestBody Product product) {
			return productService.updateProductDetails(product);
		}
		@GetMapping(value = "findProductPrice/{pid}")
		public String findProductById(@PathVariable("pid") int pid) {
			return productService.findProductPrice(pid);
		}
}
