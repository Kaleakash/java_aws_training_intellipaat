package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Order;
import com.bean.Product;
import com.repository.OrderRepository;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	
	public Product findProductById(int pid) {
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p  = op.get();
			return p;
		}else {
			return null;
		}
	}
	
	public String storeProdcut(Product product) {
	Optional<Product> op = productRepository.findById(product.getPid());
	if(op.isPresent()) {
		return "Product id must be unique";
	}else if(product.getPrice()<100){
		return "Product price must be >=100";
	}else {
		productRepository.save(product);
		return "Product details stored successfully";
	}
	}
	
	public List<Product> getAllProductDetails() {
		return productRepository.findAll();
	}
	
	public String findProductPrice(int pid) {
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			return "Product Price is "+p.getPrice();
		}else {
			return "Product not exists";
		}
	}
	
	public String updateProductDetails(Product pr) {
		Optional<Product> op = productRepository.findById(pr.getPid());
		if(op.isPresent()) {
			Product p = op.get();
				p.setPrice(pr.getPrice());
				p.setQuanity(pr.getQuanity());
				p.setUrl(pr.getUrl());
			productRepository.saveAndFlush(p);
			return "Product details updated successfully";
		}else {
			return "Product not exists";
		}
	}
	
	public int findProductQuantity(int pid) {
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
				return p.getQuanity();
		}else {
			return -1;
		}
	}
	
	public String updateProductQuantity(int pid, int quanity) {
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			p.setQuanity(p.getQuanity()-quanity);
			productRepository.saveAndFlush(p);
			return "updated";
		}else {
			return "not update";
		}
	}
	
}
