package com.javaminds.discount.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaminds.discount.model.Discount;

@RestController
@RequestMapping("/discountapi")
public class DiscountController {
	
	private final static List<Discount> list = new ArrayList<>();
	
	@GetMapping("/discount/{productName}")
	public Discount getDiscount(@PathVariable String productName) {
		
		list.add(new Discount("IPHONE", new BigDecimal(10)) );
		list.add(new Discount("BOOK", new BigDecimal(20)) );
		list.add(new Discount("CAR", new BigDecimal(30)) );
		
		return list.stream().filter(p->p.getProductName().equalsIgnoreCase(productName)).findFirst().get();
	}
}
