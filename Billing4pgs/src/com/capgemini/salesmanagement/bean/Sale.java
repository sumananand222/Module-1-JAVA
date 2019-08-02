package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {
	private int saleId;
	private int prodCode;
	private String category;
	private LocalDate saleDate;
	private int quantity;
	private float lineTotal;
	private int productPrice;
	private String productName;
	

	public Sale(int saleId, int prodCode, String category, LocalDate saleDate, int quantity, float lineTotal,
			int productPrice, String productName) {
		super();
		this.saleId = saleId;
		this.prodCode = prodCode;
		this.category = category;
		this.saleDate = saleDate;
		this.quantity = quantity;
		this.lineTotal = lineTotal;
		this.productPrice = productPrice;
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", prodCode=" + prodCode + ", category=" + category + ", saleDate=" + saleDate
				+ ", quantity=" + quantity + ", lineTotal=" + lineTotal + ", productPrice=" + productPrice
				+ ", productName=" + productName + "]";
	}
	

}
