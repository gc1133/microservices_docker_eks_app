package com.javaminds.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaminds.product.model.Discount;
import com.javaminds.product.model.Product;
import com.javaminds.product.repos.ProductRepository;
import com.javaminds.product.restclients.DiscountClient;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	DiscountClient discountClient;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		Discount discount = discountClient.getDiscount(product.getName());
		product.setPrice(product.getPrice().subtract(discount.getDiscount()));
		return productRepository.save(product);
	}

}
