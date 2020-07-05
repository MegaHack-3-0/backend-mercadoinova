package br.com.megahack.entity;

import java.math.BigDecimal;

public class Cupom {

	String description;
	BigDecimal price;

	public Cupom() {
	}

	public Cupom(String description, BigDecimal price) {
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
