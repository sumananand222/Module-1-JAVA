package com.capgemini.takehome.bean;

public class Product {
	private int product_id;
	private String name;
	private String category;
	private int price;
	private int quantity;
	//private int total;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pcode,int quantity) {
		// TODO Auto-generated constructor stub
		this.product_id=pcode;
		this.quantity=quantity;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int product_id, String name, String category, int price) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
}
