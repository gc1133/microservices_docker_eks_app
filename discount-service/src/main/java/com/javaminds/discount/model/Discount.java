package com.javaminds.discount.model;

import java.math.BigDecimal;

public class Discount {

	private String productName;
	private BigDecimal discount;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public Discount(String productName, BigDecimal discount) {
		this.productName = productName;
		this.discount = discount;
	}

	
}
