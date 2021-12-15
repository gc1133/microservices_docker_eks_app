package com.javaminds.product.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javaminds.product.model.Discount;

@FeignClient(name = "discount-service", url = "${DISCOUNT_SERVICE_URL:http://localhost:8081}")
public interface DiscountClient {
	
	@GetMapping("/discountapi/discount/{productName}")
	Discount getDiscount(@PathVariable String productName);

}
