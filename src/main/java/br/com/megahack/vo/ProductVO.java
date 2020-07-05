package br.com.megahack.vo;

import java.math.BigDecimal;
import java.text.ParseException;

import br.com.megahack.entity.Product;

public class ProductVO {

	String category;
	String brand;
	String model;
	String purchaseDate;
	BigDecimal purchasePrice;
	int factoryWarranty;
	int sellerWarranty;

	public ProductVO() {
	}

	public ProductVO(String category, String brand, String model, String purchaseDate, BigDecimal purchasePrice,
			int factoryWarranty, int sellerWarranty) throws ParseException {
		this.category = category;
		this.brand = brand;
		this.model = model;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.factoryWarranty = factoryWarranty;
		this.sellerWarranty = sellerWarranty;
	}

	public ProductVO(Product product) {
		this.category = product.getCategory();
		this.brand = product.getBrand();
		this.model = product.getModel();
		this.purchaseDate = product.getPurchaseDateAsString();
		this.purchasePrice = product.getPurchasePrice();
		this.factoryWarranty = product.getFactoryWarranty();
		this.sellerWarranty = product.getSellerWarranty();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getFactoryWarranty() {
		return factoryWarranty;
	}

	public void setFactoryWarranty(int factoryWarranty) {
		this.factoryWarranty = factoryWarranty;
	}

	public int getSellerWarranty() {
		return sellerWarranty;
	}

	public void setSellerWarranty(int sellerWarranty) {
		this.sellerWarranty = sellerWarranty;
	}

}
