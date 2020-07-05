package br.com.megahack.entity;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.megahack.vo.ProductVO;

public class Product {

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	String category;
	String brand;
	String model;
	Date purchaseDate;
	BigDecimal purchasePrice;
	int factoryWarranty;
	int sellerWarranty;
	BigDecimal avaregaSellingPrice;
	boolean sold;

	public Product() {
	}

	public Product(ProductVO vo) throws ParseException {
		this.category = vo.getCategory();
		this.brand = vo.getBrand();
		this.model = vo.getModel();
		this.purchaseDate = dateFormat.parse(vo.getPurchaseDate());
		this.purchasePrice = vo.getPurchasePrice();
		this.factoryWarranty = vo.getFactoryWarranty();
		this.sellerWarranty = vo.getSellerWarranty();
		this.sold = false;
		this.avaregaSellingPrice = purchasePrice.divide(new BigDecimal(2));
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

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
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

	public BigDecimal getAvaregaSellingPrice() {
		return avaregaSellingPrice;
	}

	public void setAvaregaSellingPrice(BigDecimal avaregaSellingPrice) {
		this.avaregaSellingPrice = avaregaSellingPrice;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	public String getPurchaseDateAsString() {
		return dateFormat.format((purchaseDate));
	}

}
